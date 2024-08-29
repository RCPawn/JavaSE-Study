package api.Regex;

public class demo1 {
    public static void main(String[] args) {
        String qq = "12345678910";
        // System.out.println(check(qq));
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
    }

    /*public static boolean check(String qq){
        int len = qq.length();
        if (len < 6 && len > 20){
            return false;
        }

        // 0不能在开头
        if (qq.startsWith("0")){
            return false;
        }

        // 必须全是数字
        for (int i = 0; i < len; i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }*/
}
