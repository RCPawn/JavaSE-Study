package map.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*
        随机点名
        被点到的学生不会再被点到
        所有学生都点完了就开启第二轮点名
         */

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛",
                "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("-----第" + i + "轮点名开始-----");
            int l = list1.size();
            Random r = new Random();
            for (int j = 0; j < l; j++) {
                int index = r.nextInt(list1.size());
                String name = list1.remove(index);
                list2.add(name);
                System.out.println(name);
            }
            list1.addAll(list2);
            list2.clear();
        }

    }
}
