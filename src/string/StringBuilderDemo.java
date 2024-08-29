package string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

        //添加字符串
        sb.append("aaa").append("bbb").append("ccc").append("ddd");

        sb.reverse(); //反转

        String str = sb.toString(); //转换成字符串

        System.out.println(str);
    }
}
