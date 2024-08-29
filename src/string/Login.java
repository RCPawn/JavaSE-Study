package string;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        // 1 定义两个变量记录正确的用户名和密码
        String rightUsername = "蜡笔小新";
        String rightPassword = "10086";

        // 2 键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("username:");
            String username = sc.next();
            System.out.println("password:");
            String password = sc.next();

            // 3 比较
            if (username.equals(rightUsername) || password.equals(rightPassword)) {
                System.out.println("登录成功！");
                break;
            } else {
                if (i == 2) {
                    System.out.println("账号" + rightUsername + "被锁定，请联系懒洋洋同学:10086！");
                } else {
                    System.out.println("登陆失败，用户名或密码有误，你还剩下" + (2 - i) + "次机会！");
                }
            }
        }


    }
}
