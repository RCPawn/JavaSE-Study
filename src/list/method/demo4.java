package list.method;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class demo4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器
        Iterator<String> it1 = list.iterator();
        while (it1.hasNext()) {
            String s1 = it1.next();
            System.out.println(s1);
        }

        //2.增强for
        for (String s2 : list) {
            System.out.println(s2);
        }

        //3.lambda
        list.forEach(s3 -> System.out.println(s3));

        //4.普通for
        for (int i = 0; i < list.size(); i++) {
            String s4 = list.get(i);
            System.out.println(s4);
        }

        //5.列表迭代器
        //额外添加了一个方法，在遍历过程中，可以添加元素
        ListIterator<String> it2 = list.listIterator();
        while (it2.hasNext()) {
            String s5 = it2.next();
            if ("bbb".equals(s5)) {
                it2.add("QQQ");
            }
        }
        System.out.println(list);
    }
}
