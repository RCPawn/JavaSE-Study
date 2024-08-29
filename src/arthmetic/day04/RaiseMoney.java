package arthmetic.day04;

import java.util.Scanner;

public class RaiseMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int plans = 0;

        for (int i = 0; i < x; i++) {
            int k = n - 2 * i;
            if (k >= 0 && k % 3 == 0 && k / 3 <= y) {
                plans++;
            }
        }

        System.out.println(plans);
    }
}
