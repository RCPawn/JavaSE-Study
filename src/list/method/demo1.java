package list.method;

import java.util.ArrayList;
import java.util.List;

/* List
1. add
2. remove
3. set
4. get */
public class demo1 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.add(1, "QQQ");

        //删除指定索引上的元素，返回被删除的元素
        Object remove = list.remove(0);
        System.out.println(remove);

        System.out.println(list);
    }
}
