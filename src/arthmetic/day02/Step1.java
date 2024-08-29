package arthmetic.day02;

import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] plans = new int[100010];
        plans[1] = 1;
        plans[2] = 2;

        for (int i = 3; i <= n; i++) {
            plans[i] = (plans[i - 1] + plans[i - 2]) % 100003;
        }

        System.out.println(plans[n]);
    }
}
