package string;

public class IdCardInformation {
    public static void main(String[] args) {
        //1.定义一个字符串记录身份证号码
        String id = "52242620040609041X";

        //2.获取出生年月日
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);

        System.out.println("人物信息:");
        System.out.println("出生年月日: " + year + "年" + month + "月" + day + "日");

        //3.获取性别
        char gender = id.charAt(16);

        //将字符转换成数字 int num = gender - 48; 这一步可有可无（ASCII奇偶相同）

        if (gender % 2 == 0) {
            //偶数 女
            System.out.println("性别: 女");
        } else {
            //奇数 男
            System.out.println("性别: 男");
        }
    }
}
