package oob.ObjectOriented1;

public class StudentTest {
    public static void main(String[] args) {

        //调用无参
        Student s0 = new Student();
        s0.setName("小猪佩奇");
        s0.setAge(6);

        Student s1 = new Student("蜡笔小新", 18);

        //打印的是地址值
        System.out.println(s0);
        System.out.println(s1);

        //调用get方法
        System.out.println(s0.getName());
        System.out.println(s0.getAge());

        System.out.println(s1.getName());
        System.out.println(s1.getAge());

    }
}