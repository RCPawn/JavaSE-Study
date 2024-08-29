package set;

import java.util.TreeSet;

//默认升序排序
public class TreeSetDemo3 {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            //按照长度进行排序
            int i = o1.length() - o2.length();
            //如果长度一样，按照首字母排序
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;
        });

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        for (String t : ts) {
            System.out.println(t);
        }
    }
}
