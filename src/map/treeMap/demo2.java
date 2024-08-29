package map.treeMap;

import java.util.TreeMap;

public class demo2 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>();

        Student s1 = new Student("tom", 20);
        Student s2 = new Student("tony", 21);
        Student s3 = new Student("jerry", 22);

        tm.put(s1, "北京");
        tm.put(s2, "上海");
        tm.put(s3, "天津");

        System.out.println(tm);
    }
}
