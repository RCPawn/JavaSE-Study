package arthmetic.day02;

import java.util.Scanner;

public class GradeTop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] gradeSum = new int[n];

        for (int i = 0; i < n; ++i) {
            name[i] = sc.next();
            int m = sc.nextInt();
            int c = sc.nextInt();
            int e = sc.nextInt();
            int g = sc.nextInt();
            gradeSum[i] = m + c + e + g;
        }

        for (int i = 0; i < 3; ++i) {
            int max = 0;
            for (int j = 1; j < n; j++) {
                if (gradeSum[j] > gradeSum[max]) {
                    max = j;
                }
            }
            System.out.println(name[max]);
            gradeSum[max] = -1;
        }
    }
}
