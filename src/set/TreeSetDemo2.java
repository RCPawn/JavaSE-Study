package set;

import java.util.TreeSet;

//默认升序排序
public class TreeSetDemo2 {
    public static void main(String[] args) {

        TreeSet<Student1> ts = new TreeSet<>();

        //1.创建对象
        Student1 s1 = new Student1("zhangsan", 20);
        Student1 s2 = new Student1("lisi", 21);
        Student1 s3 = new Student1("wangwu", 22);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        for (Student1 t : ts) {
            System.out.println(t);
        }
    }
}
