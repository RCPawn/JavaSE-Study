package string.Case;

public class LastWordLength {
    public static void main(String[] args) {
        String str = "Tryna work on my patience";

        int i = str.length() - 1;
        int count = 0;
        char c = str.charAt(str.length() - 1);
        String result = "";

        //倒着遍历 知道遇到空格为止
        while (c != ' ') {
            c = str.charAt(i);
            i--;
            count++;
            result = c + result;
        }

        System.out.println("最后一个单词是:" + result);
        System.out.println("长度为:" + (count - 1));
    }
}