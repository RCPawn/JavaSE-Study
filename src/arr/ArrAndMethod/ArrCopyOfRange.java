package arr.ArrAndMethod;

import java.util.Scanner;

public class ArrCopyOfRange {

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int index = 0;
        int[] newArr = new int[to - from];
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("数组大小:");
        int n = sc.nextInt();

        System.out.println("from:");
        int from = sc.nextInt();

        System.out.println("to:");
        int to = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("输入要截取的数组:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] copyArr = copyOfRange(arr, from, to);

        for (int i = 0; i < (to-from); i++) {
            System.out.println(copyArr[i]);
        }

    }

}