package arthmetic.day01;

import java.util.Scanner;

public class Relative7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[1000010];

        for (int i = 1; i < 1000010; i++) {
            if (!relative(i)) {
                a[i] = a[i - 1] + i * i;
            } else {
                a[i] = a[i - 1];
            }
        }

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(a[n]);
        }

    }

    public static boolean relative(int n) {
        if (n % 7 == 0) return true;

        while (n != 0) {
            if (n % 10 == 7) return true;
            n /= 10;
        }
        return false;
    }
}
