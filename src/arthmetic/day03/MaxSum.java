package arthmetic.day03;

import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000010];

        int t = sc.nextInt();
        int id = 1;

        while (t-- > 0) {
            int n = sc.nextInt();

            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt();

            int maxSum = Integer.MIN_VALUE;
            int maxLeft = 0, maxRight = 0;
            int currentSum = 0;
            int tempLeft = 0;

            for (int i = 0; i < n; ++i) {
                currentSum += arr[i];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxLeft = tempLeft;
                    maxRight = i;
                }

                if (currentSum < 0) {
                    currentSum = 0;
                    tempLeft = i + 1;
                }
            }

            System.out.printf("Case %d:\n%d %d %d\n", id++, maxSum, maxLeft + 1, maxRight + 1);
            if (t > 0) System.out.println();
        }

    }
}
