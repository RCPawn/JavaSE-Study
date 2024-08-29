package map.args;

public class demo3 {
    public static void main(String[] args) {
        /*
        JDK5, 可变参数（方法形参的参数是可以变化的）
        可变参数的细节：
        1.方法形参中，最多只能写一个可变参数
        2.方法形参中，如果除了可变参数外，还有其他参数，可变参数要写在最后
         */
        System.out.println(getSum(1, 2, 3, 4, 5));
    }

    //可变参数的底层是一个数组
    public static int getSum(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }
}
