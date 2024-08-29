package oob.ObjectOriented3.Interface1;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小青",1);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.Swim();
        System.out.println("-------------------");
        Rabbit r = new Rabbit("小白",2);
        System.out.println(r.getName() + ", " + r.getAge());
        r.eat();
        System.out.println("-------------------");
        Dog d = new Dog("小黄",3);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        d.Swim();
    }
}