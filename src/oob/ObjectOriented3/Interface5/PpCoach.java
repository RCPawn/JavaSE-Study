package oob.ObjectOriented3.Interface5;

public class PpCoach extends Coach implements Speak{
    public PpCoach() {
    }

    public PpCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
