package oob.ObjectOriented2.Extend7;

public class Chef extends Employee{
    public Chef() {
    }

    public Chef(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("大厨在炒菜");
    }
}
