package test1;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.print(Arrays.toString(arr) + " ");
        System.out.println(getSum(12));
    }

    public static int getSum(int month){
        if (month == 1 || month == 2){
            return 1;
        } else {
            return getSum(month - 1) + getSum(month - 2);
        }
    }
}
