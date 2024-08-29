package oob.ObjectOriented3.Interface5;

public class BtCoach extends Coach{
    public BtCoach() {
    }

    public BtCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("蓝球教练教蓝球");
    }
}
