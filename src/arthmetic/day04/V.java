package arthmetic.day04;

import java.util.Scanner;

public class V {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double v = (Math.sqrt(2) / 12) * Math.pow(a, 3);
        System.out.printf("%.6f", v);
    }
}
