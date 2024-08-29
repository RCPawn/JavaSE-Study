package arr.ArrAndMethod.Case;

import java.util.Scanner;

public class selectNumber {

    public static void Select(int[] originalArr, int[] arr, int start, int end, int index, int n) {
        if (index == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
            return;
        }
        for (int j = start; j <= end && end - j + 1 >= n - index; j++) {
            arr[index] = originalArr[j];
            Select(originalArr, arr, j + 1, end, index + 1, n);
        }
    }

    public static void Out(int[] originalArr, int length, int n) {
        int[] arr = new int[n];
        Select(originalArr, arr, 0, length - 1, 0, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int n = sc.nextInt();
        int[] originalArr = new int[length];

        for (int i = 0; i < length; i++) {
            originalArr[i] = i + 1;
        }

        Out(originalArr, length, n);
    }
}