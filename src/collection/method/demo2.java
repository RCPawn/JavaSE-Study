package collection.method;

import java.util.ArrayList;
import java.util.Collection;

public class demo2 {
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<>();

        Student s1 = new Student("哆啦A梦", 16);
        Student s2 = new Student("蜡笔小新", 17);
        Student s3 = new Student("懒洋洋", 18);

        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        Student s4 = new Student("懒洋洋", 18);

        System.out.println(coll.contains(s4));
    }
}
