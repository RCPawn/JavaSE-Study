package list.method;

import java.util.ArrayList;
import java.util.List;

public class demo2 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);

        //调用方法的时候，如果出现重载现象
        //优先调用，实参跟形参类型一致的那个方法
        list.remove(1);

        //手动装箱
        /**Integer i = Integer.valueOf(1);
        list.remove(i);*/

        System.out.println(list);
    }
}
