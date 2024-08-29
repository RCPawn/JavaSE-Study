package string;

import java.util.Scanner;

public class CountStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String s = sc.next();

        int smallCount = 0;
        int bigCount = 0;
        int numberCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c);
            if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }
        System.out.println();
        System.out.println("小写字母有：" + smallCount + " 个");
        System.out.println("大写字母有：" + bigCount + " 个");
        System.out.println("数字字符有：" + numberCount + " 个");
    }
}