package collection.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

//since JDK 8
public class demo1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        //匿名内部类
        //底层原理:
        //自己遍历集合，依次得到每一个元素，传给accept方法
        //s依次表示每一个数据
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //lambda表达式
        coll.forEach(s -> System.out.println(s));
    }
}
