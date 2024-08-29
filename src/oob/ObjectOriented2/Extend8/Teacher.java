package oob.ObjectOriented2.Extend8;

public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("教研部员工");
    }
}
