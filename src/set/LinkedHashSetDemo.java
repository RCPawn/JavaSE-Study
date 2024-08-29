package set;

import java.util.LinkedHashSet;

//有序、不重复、无索引
//去重且有序
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //1.创建对象
        Student1 s1 = new Student1("懒洋洋", 20);
        Student1 s2 = new Student1("小灰灰", 20);
        Student1 s3 = new Student1("蜡笔小新", 20);
        Student1 s4 = new Student1("懒洋洋", 20);

        //2.创建集合
        LinkedHashSet<Student1> lhs = new LinkedHashSet<>();

        //3.添加元素
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        //4.打印集合
        for (Student1 lh : lhs) {
            System.out.println(lh);
        }
    }
}
