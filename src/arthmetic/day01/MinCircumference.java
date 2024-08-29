package arthmetic.day01;

import java.util.Scanner;

public class MinCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        for (int l = 1; l <= S; l++) {
            int w = S / l;
            if (l * w == S && l >= w) {
                System.out.println(2 * (l + w));
                break;
            }
        }
    }
}
