package arthmetic.day01;

import java.util.Scanner;

public class AntsClimb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] p = new int[n];
        int max = 0, min = 0;

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            int t1 = Math.min(p[i], l - p[i]);
            min = Math.max(t1, min);
            int t2 = Math.max(p[i], l - p[i]);
            max = Math.max(t2, max);
        }

        System.out.println(min + " " + max);
    }
}
