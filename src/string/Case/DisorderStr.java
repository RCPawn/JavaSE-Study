package string.Case;

import java.util.Random;
import java.util.Scanner;

public class DisorderStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串:");
        String str = sc.next();

        String result = disorder(str);

        System.out.println("打乱后的字符串:");
        System.out.println(result);

    }

    public static String disorder(String str){

        //转换成字符数组
        char[] arr = str.toCharArray();

        Random r = new Random();
        int index = r.nextInt(arr.length);

        for (int i = 0; i < arr.length; i++) {
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        String result = new String(arr);

        return result;
    }
}
