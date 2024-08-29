package collection.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
细节注意点:
1.报错NoSuchElementException
2.迭代器遍历完毕，指针不会复位
3.循环中只能用一次next方法（指针移动）
4.迭代器遍历时，不能用集合的方法进行增加或删除*/
public class demo1 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("eee");
        coll.add("ddd");

        //获取迭代器对象
        //迭代器好比一个箭头，默认指向集合的0索引处
        Iterator<String> it = coll.iterator();

        while (it.hasNext()) {
            //获取元素移动指针
            String str = it.next();
            System.out.println(str);
        }

        //如果需要进行第二次遍历，就要再获取一个新的迭代器对象

    }
}
