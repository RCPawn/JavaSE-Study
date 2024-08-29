package oob.ObjectOriented3.Abstract1;

public class Student extends Person {

    // 2.抽象类的子类
    // 要么重写抽象类的所有抽象方法
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
