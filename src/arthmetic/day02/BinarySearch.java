package arthmetic.day02;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            int index = Arrays.binarySearch(a, b[i]);
            if (index < 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
