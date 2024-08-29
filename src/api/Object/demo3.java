package api.Object;

public class demo3 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");

        // 这儿的 equals 是 String 里面的
        // 先判断参数是不是字符串 如果不是直接false
        System.out.println(s.equals(sb)); // false

        // 这儿的 equals 是 Object 里面的
        // StringBuilder 里面没有重写 equals 方法
        System.out.println(sb.equals(s)); // false

    }
}
