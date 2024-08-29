package string.Case;

import java.util.Scanner;
import java.util.StringJoiner;

public class IntegerToRoman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        while (true) {
            System.out.println("请录入一个字符串:");
            str = sc.next();

            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("当前字符串不符合规范,请重新输入!");
                continue;
            }
        }

        //将内容变为罗马数字
        StringJoiner sj = new StringJoiner(" ", "(", ")");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
//            int num = c - 48; //将字符转换成数字
            String s = changeToRoman(c);
            sj.add(s);
        }

        System.out.println(sj);
    }

    public static String changeToRoman(char num) {

        //String[] arr = {"","Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        //return arr[num];

        //JDK12
        String str =switch (num) {
            case '0' -> "";
            case '1' -> "Ⅰ";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            default -> str = "";
        };
        return str;
    }

    public static boolean checkStr(String str) {
        //1.长度小于等于9
        if (str.length() > 9) {
            return false;
        }

        //2.只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        //只有当字符串里面的数字全部判断完毕后 才能认为字符串符合规则
        return true;
    }
}
