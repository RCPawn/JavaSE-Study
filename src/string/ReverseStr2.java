package string;

import java.util.Scanner;

public class ReverseStr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要反转的字符串:");
        String inputSb = sc.next();

        StringBuilder sb = new StringBuilder(inputSb).reverse();

        String str = sb.toString();

        System.out.println("反转后的字符串:");
        System.out.println(str);
    }
}
