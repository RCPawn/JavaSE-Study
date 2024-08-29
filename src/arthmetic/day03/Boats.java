package arthmetic.day03;

import java.util.Arrays;
import java.util.Scanner;

public class Boats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] w = new int[n];

        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }

        Arrays.sort(w);

        int l = 0, r = n - 1, boats = 0;
        while (l <= r) {
            if (w[l] + w[l] <= m) {
                l++;
            }
            r--;
            boats++;
        }

        System.out.println(boats);
    }
}
