package oob.ObjectOriented3.polymorphism1;

 /* 多态
 1.什么是多态
 对象的多种形态
 2.前提
 有继承/实现关系
 有父类引用指向子类对象
 有方法的重写
 3.多态的好处
 使用父类型作为参数 可以接收所有子类对象
 体现多态的扩展性与便利 */

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("懒洋洋");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("哆啦A梦");
        t.setAge(19);

        Administrator admin = new Administrator();
        admin.setName("蜡笔小新");
        admin.setAge(20);

        register(s);
        register(t);
        register(admin);
    }

    //这个方法 能接收老师 学生 管理员
    //只能把参数写成这三个类的父类
    public static void register(Person p){
        p.show();
    }
}
