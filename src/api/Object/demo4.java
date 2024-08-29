package api.Object;/*
package Object;

import com.google.gson.Gson;

public class demo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // protected Object clone

        // 1.创建一个对象
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        User u1 = new User(1, "懒洋洋", "12345", "girl11", data);

        // 2.克隆对象
        User u2 = (User) u1.clone();

        // Object 中的克隆是浅克隆

        System.out.println(u1);
        System.out.println(u2);

        // 1.第三方克隆工具 深克隆
        // 2.编写代码

        Gson gson = new Gson();
        // 把对象变成字符串
        String s = gson.toJson(u1);
        // 再把字符串变成对象
        User user = gson.fromJson(s, User.class);

        int[] arr1 = u1.getData();
        arr1[0] = 100;

        // 打印对象
        System.out.println(user);
    }
}
*/
