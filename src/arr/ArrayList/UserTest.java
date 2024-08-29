package arr.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("01", "懒洋洋", "10086");
        User u2 = new User("02", "蜡笔小新", "12345");
        User u3 = new User("03", "小猪佩奇", "54321");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println("id:");
        String id = sc.next();

        //根据 id 查找用户信息
        int index = getIndex(list, id);
        if (index >= 0){
            System.out.println("该用户信息为:");
            System.out.println(list.get(index));
        } else {
            System.out.println("该用户不存在！");
        }

    }

    //根据 id 查找索引
    public static int getIndex(ArrayList<User> list, String id) {
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            flag = list.get(i).getId().equals(id);
            if (flag) {
                return i;
            }
        }
        return -1;
    }

    //根据 id 查找用户是否存在
    public static boolean contains(ArrayList<User> list, String id) {
        return getIndex(list,id) >= 0;
    }

}