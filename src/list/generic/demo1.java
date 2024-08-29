package list.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class demo1 {
    public static void main(String[] args) {
        //没有限定类型，默认为Object
        //在获取数据时无法使用特有行为
        ArrayList list = new ArrayList();

        list.add(123);
        list.add("abc");
        list.add(new Student("懒洋洋",19));

        Iterator it = list.iterator();
        while (it.hasNext()) {
            //多态的弊端是不能访问子类特有的功能
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
