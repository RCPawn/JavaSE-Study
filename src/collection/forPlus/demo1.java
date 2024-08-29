package collection.forPlus;

import java.util.ArrayList;
import java.util.Collection;

//since JDK 5
//所有的单列集合和数组才能用增强for进行遍历
public class demo1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        //s就是一个第三方变量在循环过程中依次表示集合中的每一个数据
        //coll.for
        for (String s : coll) {
            System.out.println(s);
        }

        /**String[] arr = {"aaa", "bbb", "ccc", "ddd", "eee"};

        for (String s : arr) {
            System.out.println(s);
        }*/
    }
}
