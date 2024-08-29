package string;

import java.util.Scanner;

public class ConnectStr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("arr.length:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("arr:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        String str = arrToString(arr);
        System.out.println(str);

    }

    //定义方法 拼接字符串
    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        }

        if (arr.length == 0) {
            return "[]";
        }

        // arr 不为 null 长度不是 0
        String str0 = "[";
        String str1 = "]";
        String result;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str0 = str0 + arr[i];
            } else {
                str0 = str0 + arr[i] + ", ";
            }
        }
        result = str0 + str1;
        return result;
    }

}