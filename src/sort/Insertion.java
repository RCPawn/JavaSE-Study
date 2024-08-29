package sort;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4, 6, 10, 9, 7, 8};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }


    //插入排序
    /*private static void insertionSort(int[] arr) {
        int startIndex = getStartIndex(arr);
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }*/

    //得到无序数组的起始索引
    /*private static int getStartIndex(int[] arr) {
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i;
                break;
            }
        }
        return startIndex;
    }*/
}