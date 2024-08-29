package oob.ObjectOriented3.Interface5;

public class PpPlayer extends Player implements Speak{
    public PpPlayer() {
    }

    public PpPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
