package set;

import java.util.HashSet;
import java.util.Set;

//set系列集合元素不能重复
//无序、不重复、没有索引
public class SetDemo {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("aaa"); //总是true
        boolean b = s.add("bbb");
        boolean c = s.add("bbb");
        boolean d = s.add("ccc");

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        //Lambda表达式
        s.forEach(str -> System.out.println(str));

        //迭代器
        /**Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }*/

        //增强for
        /**for (String s1 : s) {
            System.out.println(s1);
        }*/
    }
}
