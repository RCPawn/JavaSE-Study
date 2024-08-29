package oob.ObjectOriented2.Extend6;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        //赋值给子类的带参构造
        Student s2 = new Student("蜡笔小新", 19);

        System.out.println(s2.name + ", " + s2.age);
    }
}
