package arthmetic.day02;

import java.util.Arrays;
import java.util.Scanner;

public class HeightQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = a[i];
        }

        int dis = 0;
        Arrays.sort(b, 0, n);
        for (int i = 0; i < n; i++) {
            int pos = Arrays.binarySearch(b, 0, n, a[i]);
            dis += Math.abs(pos - i);
        }
        System.out.println(dis);
    }
}
