package oob.ObjectOriented2.Extend8;

public class Tutor extends Employee{
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("助教");
    }
}
