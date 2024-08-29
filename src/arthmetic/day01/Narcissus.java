package arthmetic.day01;

import java.util.Scanner;

public class Narcissus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            boolean find = false;

            for (int i = m; i <= n; i++) {
                if (narcissus(i)) {
                    find = true;
                    System.out.print(i + " ");
                }
            }

            if (!find) {
                System.out.println("no");
            }
        }
    }

    public static boolean narcissus(int n) {
        int ge = n % 10;
        int shi = n / 10 % 10;
        int bai = n / 100;
        return n == ge * ge * ge + shi * shi * shi + bai * bai * bai;
    }
}
