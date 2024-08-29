package string;

public class MaskingPhoneNumber {
    public static void main(String[] args) {
        //获取一个手机号码
        String phoneNumber = "12345678910";

        String start = phoneNumber.substring(0, 3); //截取手机号前三位
        String end = phoneNumber.substring(7); //截取手机号后四位

        System.out.println(start);
        System.out.println(end);

        //拼接
        String result = start + "****" + end;
        System.out.println(result);
    }
}
