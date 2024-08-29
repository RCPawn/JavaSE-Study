package oob.ObjectOriented2.Static1;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        //s1.teacherName = "老师";
        //推荐用类名调用静态变量
        Student.teacherName = "老师";

        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(24);
        s2.setGender("男");
        //s2.teacherName = "老师";

        s2.study();
        s2.show();
    }
}