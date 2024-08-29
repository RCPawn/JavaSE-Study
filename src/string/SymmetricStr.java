package string;

import java.util.Scanner;

public class SymmetricStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串:");
        String str = sc.next();

        //反转键盘录入的字符串
        StringBuilder sb = new StringBuilder();
        String result = sb.append(str).reverse().toString();

        if (result.equals(str)) {
            System.out.println("该字符串对称");
        } else {
            System.out.println("该字符串不对称");
        }

    }
}
