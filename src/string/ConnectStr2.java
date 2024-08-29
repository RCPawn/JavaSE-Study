package string;

import java.util.Scanner;

public class ConnectStr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("arr.length:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        String result = arrToString(arr);

        System.out.println(result);
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                sb.append(", ").append(arr[i]);
            } else {
                sb.append(arr[i]);
            }
        }
        sb.append("]");

        String result = sb.toString();

        return result;
    }
}
