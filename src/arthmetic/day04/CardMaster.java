package arthmetic.day04;

import java.util.Scanner;

public class CardMaster {

    private static final int M = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N];
        int[] b = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        long[][] dp = new long[N][2];
        dp[0][0] = 1;
        dp[0][1] = 1;

        for (int i = 1; i < N; i++) {
            if (a[i] != a[i - 1]) {
                dp[i][0] = (dp[i][0] + dp[i - 1][0]) % M;
            }
            if (a[i] != b[i - 1]) {
                dp[i][0] = (dp[i][0] + dp[i - 1][1]) % M;
            }
            if (b[i] != a[i - 1]) {
                dp[i][1] = (dp[i][1] + dp[i - 1][0]) % M;
            }
            if (b[i] != b[i - 1]) {
                dp[i][1] = (dp[i][1] + dp[i - 1][1]) % M;
            }
        }

        long plans = (dp[N - 1][0] + dp[N - 1][1]) % M;
        System.out.println(plans);
    }
}
