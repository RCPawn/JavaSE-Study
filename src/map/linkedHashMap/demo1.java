package map.linkedHashMap;

import java.util.LinkedHashMap;

public class demo1 {
    public static void main(String[] args) {
        //有序，不重复，无索引
        //1.创建集合
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        //2.添加元素
        lhm.put("a",1);
        lhm.put("a",2);
        lhm.put("b",3);
        lhm.put("c",4);

        //3.打印集合
        System.out.println(lhm);
    }
}
