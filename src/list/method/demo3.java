package list.method;

import java.util.ArrayList;
import java.util.List;

public class demo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //set
        String result1 = list.set(0, "QQQ");
        System.out.println(result1);

        //get
        String result2 = list.get(0);
        System.out.println(result2);

        System.out.println(list);
    }
}
