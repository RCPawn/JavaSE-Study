package sort;

public class Recursion {
    public static void main(String[] args) {
        int sum = getSum(100);
        System.out.println(sum);
    }

    //递归求和
    public static int getSum(int num){
        //出口，方法不再调用自己
        if(num == 1){
            return 1;
        }
        return num + getSum(num - 1);
    }
}
