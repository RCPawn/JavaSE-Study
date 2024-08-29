package oob.ObjectOriented2.Extend8;

public class Buyer extends Employee{
    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("采购专员");
    }
}
