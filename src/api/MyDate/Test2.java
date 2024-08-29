package api.MyDate;

public class Test2 {
    public static void main(String[] args) {
        String str = "123456789";

        if (!str.matches("[1-9]\\d{0,9}")){
            //错误的数据
            System.out.println("数据格式有误！");
        } else {
            //正确的数据
            System.out.println("数据格式正确！");

            int number = 0;
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                number = number * 10 + c;
            }

            System.out.println(number);
        }
    }
}