package sort;

import java.util.Arrays;

public class Quick2 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        if (start > end) {
            return;
        }

        int baseNumber = arr[i];

        while (start != end) {
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }

            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
}