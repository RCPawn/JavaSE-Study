package arr.ArrAndMethod.Case;

import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("位数：");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("解密的数：");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        for (int j = 0; j < n; j++) {
            num[j] = (num[j] + 5) % 10;
        }

        System.out.println("解密后的数：");
        for (int k = n - 1; k >= 0; k--) {
            System.out.print(num[k]);
        }
    }
}