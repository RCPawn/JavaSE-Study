package arr.ArrayList;

import java.util.ArrayList;

public class Print1 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>(); //字符串
        ArrayList<Character> list2 = new ArrayList<>(); //字符
        ArrayList<Integer> list = new ArrayList<>(); //整数

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //打印
        System.out.println(list);

        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}