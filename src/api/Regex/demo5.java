package api.Regex;

public class demo5 {
    public static void main(String[] args) {
        // 验证用户名
        // 大小写字母 数字下划线 4-16位
        String regex1 = "\\w{4,16}";
        System.out.println("21432w".matches(regex1));

        // 身份证简单校验
        String regex2 = "[1-9]\\d{16}(\\d|(?i)x)";
        System.out.println("52242620040609041X".matches(regex2));

        // 忽略 (?i) 后面的大小写
        String regex3 = "(?i)abc";
        System.out.println("abc".matches(regex3));
        System.out.println("Abc".matches(regex3));
        System.out.println("ABC".matches(regex3));
    }
}
