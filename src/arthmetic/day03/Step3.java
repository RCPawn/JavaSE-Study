package arthmetic.day03;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] plans = new int[100010];
        plans[1] = plans[2] = plans[3] = 1;

        for (int i = 4; i <= n; i++) {
            plans[i] = (plans[i - 1] + plans[i - 3]) % 100003;
        }

        System.out.println(plans[n]);
    }
}
