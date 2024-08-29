package string;

import java.util.Scanner;

public class ReverseStr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要反转的字符串:");
        String str = sc.next();

        String afterReverse = reverse(str);

        System.out.println("反转后的字符串:");
        System.out.println(afterReverse);
    }

    //字符串反转
    public static String reverse(String str){
        String afterReverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            afterReverse += c;
        }
        return afterReverse;
    }
}
