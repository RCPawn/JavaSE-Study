package collection.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo2 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("eee");
        coll.add("ddd");

        Iterator<String> it = coll.iterator();

        while (it.hasNext()) {
            String str = it.next();
            if ("bbb".equals(str)) {
                //不能用集合的方法添加或删除
                //可以用迭代器的方法进行删除
                //想要添加暂时没有办法
                it.remove();
            }
        }
        System.out.println(coll);
    }
}