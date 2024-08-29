package project1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentApp {
    static ArrayList<User> list = new ArrayList<>();

    //静态代码块 数据初始化
    static {
        //添加一些用户信息
        list.add(new User("懒洋洋","1234pawn"
                ,"111111111111111111","22222222222"));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-----------欢迎来到学生管理系统-----------");
            System.out.println("请选择操作：1.登录 2.注册 3.忘记密码 4.退出");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("谢谢使用！");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }

    }

    //忘记密码
    private static void forgetPassword(ArrayList<User> list)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        boolean flag = contains(list, username);
        if (!flag) {
            System.out.println("当前用户" + username + "未注册，请先注册！");
            return;
        }

        System.out.println("请输入身份证号码");
        String personID = sc.next();
        System.out.println("请输入手机号码");
        String phoneNumber = sc.next();

        int index = findIndex(list, username);
        User user = list.get(index);
        //比较身份证与手机号码
        if (!(user.getPersonID().equalsIgnoreCase(personID)
                && user.getPhoneNumber().equals(phoneNumber))) {
            System.out.println("身份证或手机号码输入有误，不能修改密码！");
            return;
        }
        String password;
        String againPassword;
        while (true) {
            System.out.println("请输入新的密码");
            password = sc.next();
            System.out.println("确认密码");
            againPassword = sc.next();
            if (password.equals(againPassword)) {
                System.out.println("两次密码输入一致");
                break;
            } else {
                System.out.println("两次密码输入不一致，请重新输入！");
            }
        }
        //修改密码
        user.setPassword(password);
        System.out.println("密码修改成功！");
    }

    //注册
    private static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        String username;
        String password;
        String personID;
        String phoneNumber;

        //1.用户键盘录入信息
        while (true) {
            System.out.println("请输入用户名");
            username = sc.next();
            boolean flag1 = checkUsername(username);
            if (!flag1) {
                System.out.println("不满足条件");
                continue;
            }

            //校验用户名是否唯一
            boolean flag2 = contains(list, username);
            if (flag2) {
                //用户名存在
                System.out.println("用户名" + username + "已存在，请重新输入！");
            } else {
                System.out.println("用户名" + username + "可用");
                break;
            }
        }

        //2.键盘录入密码
        while (true) {
            System.out.println("请输入要注册的密码");
            password = sc.next();
            System.out.println("请再次输入要注册的密码");
            String againPassword = sc.next();
            if (!password.equals(againPassword)) {
                System.out.println("两次密码输入不一致，请重新输入！");
                continue;
            } else {
                System.out.println("两次密码输入一致，注册成功！");
                break;
            }
        }

        //3.键盘录入身份证号码
        while (true) {
            System.out.println("请输入身份号码");
            personID = sc.next();
            boolean flag = checkPersonID(personID);
            if (flag) {
                System.out.println("身份证号码满足要求");
                break;
            } else {
                System.out.println("身份证号码格式有误，请重新输入！");
            }
        }

        //4.输入手机号码
        while (true) {
            System.out.println("请输入手机号码");
            phoneNumber = sc.next();
            boolean flag = checkphoneNumber(phoneNumber);
            if (flag) {
                System.out.println("手机号码格式正确");
                break;
            } else {
                System.out.println("手机号码格式有误，请重新输入！");
                continue;
            }
        }

        //将信息放到用户对象中
        User u = new User(username, password, personID, phoneNumber);

        //将用户对象添加到集合当中
        list.add(u);
        System.out.println("注册成功！");

        printlist(list);

    }

    //登录
    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            //判断用户名是否存在
            boolean flag = contains(list, username);
            if (!flag) {
                System.out.println("用户名" + username + "未注册，请先注册再登录！");
                return;
            }

            System.out.println("请输入密码");
            String password = sc.next();

            while (true) {
                String rightCode = getCode();
                System.out.println("当前正确的验证码为" + rightCode);
                System.out.println("请输入验证码");
                String code = sc.next();

                if (code.equalsIgnoreCase(rightCode)) {
                    System.out.println("验证码正确");
                    break;
                } else {
                    System.out.println("验证码错误！");
                }
            }

            //验证用户名和密码是否正确
            //将零散的数据封装成一个对象
            User userInfo = new User(username, password, null, null);
            boolean result = checkUserInfo(list, userInfo);
            if (result) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("登陆失败，用户名和密码错误！");
                if (i == 2) {
                    System.out.println("当前账号" + username + "被锁定，请联系过河卒解除锁定！");
                    return;
                } else {
                    System.out.println("用户名或密码错误，还有" + (2 - i) + "次机会！");
                }
            }

        }
    }

    //验证用户名和密码
    private static boolean checkUserInfo(ArrayList<User> list, User userInfo) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(userInfo.getUsername())
                    && user.getPassword().equals(userInfo.getPassword())) {
                return true;
            }
        }

        return false;
    }

    //生成验证码
    private static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        StringBuilder sb = new StringBuilder();
        //随机抽取4个字符
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            Character c = list.get(index);
            sb.append(c);
        }

        //将随机数字添加到末尾
        int number = r.nextInt(10);
        sb.append(number);

        char[] arr = sb.toString().toCharArray();
        //拿着最后一个索引和随机索引进行交换
        int randomIndex = r.nextInt(arr.length - 1);
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return new String(arr);
    }

    //遍历集合
    private static void printlist(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            System.out.println(u.getUsername() + ", " + u.getPassword()
                    + ", " + u.getPersonID() + ", " + u.getPhoneNumber());
        }
    }

    //判断电话号码
    private static boolean checkphoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        }
        if (phoneNumber.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    //判断身份证号码
    private static boolean checkPersonID(String personID) {
        if (personID.length() != 18) {
            return false;
        }
        //不能以0开头
        if (personID.startsWith("0")) {
            return false;
        }
        //前十七位必须为数字
        for (int i = 0; i < personID.length() - 1; i++) {
            char c = personID.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        //最后一位可以是数字，也可以是大写X或者小写x
        char endChar = personID.charAt(personID.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X')) {
            return true;
        } else {
            return false;
        }

    }

    //判断用户是否唯一
    private static boolean contains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String rightUsername = user.getUsername();
            if (rightUsername.equals(username)) {
                return true;
            }
        }
        return false;
    }

    //判断用户名是否符合标准
    private static boolean checkUsername(String username) {
        //用户名长度在3~15之间
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }

        //只能是字母加数字的组合
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }

        //但是不能是纯数组
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;
            }
        }
        return count > 0;
    }

    //找到用户对象的索引
    private static int findIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

}