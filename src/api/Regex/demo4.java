package api.Regex;

public class demo4 {
    public static void main(String[] args) {
        // 验证手机号码
        String regex1 = "1[3-9]\\d{9}";
        System.out.println("18076120275".matches(regex1));

        // 验证座机号
        String regex2 = "0\\d{2,3}-?\\d\\d{4,9}";
        System.out.println("020-2324242".matches(regex2));
        System.out.println("0202324242".matches(regex2));

        // 验证邮箱号码
        String regex3 = "\\w+@[\\w&&[^_]]{2,9}(\\.[a-z[A-Z]]{2,3}){1,2}";
        System.out.println("826446011@qq.com".matches(regex3));

        String regex4 = "";
    }
}