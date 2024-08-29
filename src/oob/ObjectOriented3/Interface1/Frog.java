package oob.ObjectOriented3.Interface1;

public class Frog extends Animal implements Swim{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }

    @Override
    public void Swim() {
        System.out.println("青蛙在蛙泳");
    }

}
