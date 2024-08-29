package map.args;

public class demo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(getSum(arr));
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
