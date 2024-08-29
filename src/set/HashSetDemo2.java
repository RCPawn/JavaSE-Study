package set;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {

        //1.创建对象
        Student1 s1 = new Student1("懒洋洋", 20);
        Student1 s2 = new Student1("小灰灰", 20);
        Student1 s3 = new Student1("蜡笔小新", 20);
        Student1 s4 = new Student1("懒洋洋", 20);

        //2.创建集合
        HashSet<Student1> hs = new HashSet<>();

        //3.添加元素
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        //4.打印集合
        System.out.println(hs);
    }
}
