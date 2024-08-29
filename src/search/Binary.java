package search;

public class Binary {
    public static void main(String[] args) {
        //数组必须是升序的
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int num = 79;
        int index = binarySearch(arr, num);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int num) {
        int index = -1;
        int left = 0;
        int right = arr.length - 1;

        //当 left == right 时，仍然有一个元素可以进行比较，因此需要包括这种情况
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == num) {
                index = mid;
                break;
            } else if (num < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }
}
