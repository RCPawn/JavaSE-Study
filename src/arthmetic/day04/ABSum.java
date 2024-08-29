package arthmetic.day04;

import java.util.Scanner;

public class ABSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String a = sc.next();
            String b = sc.next();

            if (a.equals("0") && b.equals("0")) break;

            int x = convert(a);
            int y = convert(b);

            System.out.println(x + y);
        }
    }

    public static int convert(String s) {
        return switch (s) {
            case "0", "Zero", "零" -> 0;
            case "1", "One", "一" -> 1;
            case "2", "Two", "二" -> 2;
            case "3", "Three", "三" -> 3;
            case "4", "Four", "四" -> 4;
            case "5", "Five", "五" -> 5;
            case "6", "Six", "六" -> 6;
            case "7", "Seven", "七" -> 7;
            case "8", "Eight", "八" -> 8;
            case "9", "Nine", "九" -> 9;
            default -> -1;
        };
    }
}

