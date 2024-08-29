package api.MyDate;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(toBinaryString(8));
        System.out.println(Integer.toBinaryString(8));
    }

    public static String toBinaryString(int number) {
        StringBuilder sb = new StringBuilder();
        while (number != 0) {
            int x = number % 2;
            //倒着拼接
            sb.insert(0, x);
            number /= 2;
        }
        return sb.toString();
    }
}
