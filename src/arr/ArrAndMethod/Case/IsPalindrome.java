package arr.ArrAndMethod.Case;

import java.util.Scanner;

public class IsPalindrome {
    public static boolean isPalindrome(int num) {
        String numStr = String.valueOf(num);
        int left = 0;
        int right =numStr.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num:");
        int num = sc.nextInt();
        if (isPalindrome(num)){
            System.out.println(num+"是回文数");
        }
        else {
            System.out.println(num+"不是回文数");
        }

    }
}