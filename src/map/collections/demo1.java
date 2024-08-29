package map.collections;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //1.批量添加
        Collections.addAll(list, "abc", "de", "f");
        System.out.println(list);

        //2.打乱
        Collections.shuffle(list);
        System.out.println(list);
    }
}
