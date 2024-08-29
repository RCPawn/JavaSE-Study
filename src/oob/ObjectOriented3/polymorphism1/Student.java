package oob.ObjectOriented3.polymorphism1;

public class Student extends Person{

    @Override
    public void show(){
        System.out.println("学生---" + getName() + "---" + getAge());
    }
}
