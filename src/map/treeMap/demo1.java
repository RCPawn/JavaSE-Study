package map.treeMap;

import java.util.TreeMap;

public class demo1 {
    public static void main(String[] args) {
        //不重复，无索引，可排序
        //默认按照key升序排列
        //new Comparator<Integer>()按照key进行降序排序
        TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> {
            //o1:当前要添加的元素
            //o2:已经在红黑树中存在的元素
            return o2 - o1;
        });

        tm.put(1, "tom");
        tm.put(3, "jerry");
        tm.put(2, "tony");

        System.out.println(tm);
    }
}
