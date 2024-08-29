package api.Object;

public class demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("懒洋洋",19);
        Student s2 = new Student("懒洋洋",19);

        // 重写 equals 方法 比较的是对象内部的属性值
        boolean result1 = s1.equals(s2);
        System.out.println(result1);
    }
}
