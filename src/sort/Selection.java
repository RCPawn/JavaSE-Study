package sort;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        Select(arr);
        printArr(arr);
    }

    //选择排序
    private static void Select(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
