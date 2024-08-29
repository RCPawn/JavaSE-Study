package oob.ObjectOriented2.Extend8;

public class Lecturer extends Employee{
    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("讲师");
    }
}
