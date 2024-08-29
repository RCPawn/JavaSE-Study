package string.Case;

public class StrToInt {
    public static void main(String[] args) {
        String str1 = "1234";
        String str2 = "123";

        int num1 = stringToInt(str1);
        int num2 = stringToInt(str2);

        int result = num1 * num2;

        System.out.println(result);
    }

    public static int stringToInt(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int digitValue = c - '0';  // 转换字符数字为对应的整数值
            result = result * 10 + digitValue;  // 更新结果，将当前位数字添加到结果的个位上
            System.out.println(result);
        }
        return result;
    }

}