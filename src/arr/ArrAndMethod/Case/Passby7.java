package arr.ArrAndMethod.Case;

import java.util.Scanner;

public class Passby7 {
    public static int isAbout7(int num) {
        if (num % 7 == 0) {
            return 1;
        }
        while (num > 0) {
            if (num % 10 == 7) {
                return 1;
            }
            num /= 10;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数字:\n");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (isAbout7(i)==0) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}

