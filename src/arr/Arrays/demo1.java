package arr.Arrays;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("---------------- toString -----------------");
        System.out.println(Arrays.toString(arr1));

        System.out.println("---------------- binarySearch -----------------");
        System.out.println(Arrays.binarySearch(arr1, 10));

        System.out.println("---------------- copyOf -----------------");
        int[] newArr1 = Arrays.copyOf(arr1, 8);
        System.out.println(Arrays.toString(newArr1));

        System.out.println("---------------- copyOfRange -----------------");
        int[] newArr2 = Arrays.copyOfRange(arr1, 0, 10);
        System.out.println(Arrays.toString(newArr2));

        int[] arr2 = {1, 6, 2, 7, 9, 3, 4, 5, 10, 8};
        System.out.println("---------------- sort -----------------");
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("---------------- fill -----------------");
        Arrays.fill(arr2,0);
        System.out.println(Arrays.toString(arr2));
    }
}
