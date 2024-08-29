package set;

import java.util.Iterator;
import java.util.TreeSet;

//默认升序排序
public class TreeSetDemo1 {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(4);
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);

        //迭代器
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            Integer str = it.next();
            System.out.println(str);
        }

        //增强for
        for (Integer t : ts) {
            System.out.println(t);
        }

        //Lambda表达式
        ts.forEach(str -> System.out.println(str));
    }
}
