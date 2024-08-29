package map.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {
        //无序，不重复，无索引
        //HashMap的键位置存储的是自定义对象，需要重写hashCode和equals方法

        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        hm.put(s1, "江苏");
        hm.put(s2, "浙江");
        hm.put(s3, "福建");

        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key + "=" + value);
        }

        for (Map.Entry<Student, String> entry : hm.entrySet()) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        hm.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
