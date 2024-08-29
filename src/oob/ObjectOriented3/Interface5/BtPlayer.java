package oob.ObjectOriented3.Interface5;

public class BtPlayer extends Player{
    public BtPlayer() {
    }

    public BtPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学篮球");
    }
}
