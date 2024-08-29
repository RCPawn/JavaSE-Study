package oob.ObjectOriented3.polymorphism1;

public class Administrator extends Person {
    @Override
    public void show() {
        System.out.println("管理员---" + getName() + "---" + getAge());
    }
}
