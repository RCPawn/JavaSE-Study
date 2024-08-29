package oob.ObjectOriented2.Extend6;

public class Student extends Person{
    public Student(){
        // 访问父类的构造方法
        super(); // 虚拟机 会默认加上
        // 父类的无参构造访问完再执行自己
        System.out.println("子类的无参构造");
    }

    public Student(String name,int age){
        // 将参数传递给父类的带参构造
        super(name,age);
    }
}
