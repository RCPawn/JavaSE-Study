package arthmetic.day01;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = perfect(n);
        if (flag == 0) {
            System.out.println("No");
        } else {
            System.out.println(flag);
        }
    }

    public static int perfect(int n) {
        for (int i = 0; i < n; i++) {
            if (n == i * i) {
                return i;
            }
        }
        return 0;
    }
}
