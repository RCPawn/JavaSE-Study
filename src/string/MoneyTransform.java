package string;

import java.util.Scanner;

public class MoneyTransform {
    //金额转换
    public static String getCapitalNum(int num) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[num];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money;
        while (true) {
            System.out.println("请输入金额:");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额无效！");
            }
        }

        //定义一个变量表示钱的大写
        String moneyStr = "";

        //1.得到 money 里面的每一位数字
        while (money != 0) {
            //从右往左获取数字
            int ge = money % 10;

            //2.转换成中文大写
            String afterTransform = getCapitalNum(ge);
            moneyStr = afterTransform + moneyStr;

            //去掉刚刚获取的数字
            money /= 10;
        }
        //3.在前面补 0 补齐7位
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        //4.插入单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};

        //遍历 moneyStr 插入单位
        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            //把大写数字和单位拼接到 result 当中
            result = c + arr[i];
            System.out.print(result);
        }
    }
}