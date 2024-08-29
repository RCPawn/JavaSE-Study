package oob.ObjectOriented3.Abstract2;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("呱呱呱",1);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.drink();
        System.out.println("-------------------");
        Dog d = new Dog("汪汪汪",2);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        d.drink();
        System.out.println("-------------------");
        Sheep s = new Sheep("绵绵绵",3);
        System.out.println(s.getName() + ", " + s.getAge());
        s.eat();
        s.drink();
    }
}