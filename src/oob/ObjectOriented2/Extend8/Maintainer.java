package oob.ObjectOriented2.Extend8;

public class Maintainer extends Employee{
    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("专业维护员");
    }
}
