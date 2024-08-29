package search;

public class Interpolation {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int num = 79;
        int index = interpolationSearch(arr,num);
        System.out.println(index);
    }

    private static int interpolationSearch(int[] arr, int num){
        int index = -1;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (num-arr[left]) / (arr[right] - arr[left] * (right - left));
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