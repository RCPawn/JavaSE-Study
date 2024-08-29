package arthmetic.day01;

import java.util.Scanner;

public class BuyPlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int plan = 0;
        for (int i = 0; i <= n / x; i++) {
            for (int j = 0; j <= n / y; j++) {
                int k = m - i - j;
                if (k >= 0 && k % z == 0 && n == x * i + y * j + k / z) {
                    plan++;
                }
            }
        }
        System.out.println(plan);
    }
}
