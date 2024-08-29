package oob.ObjectOriented2.Extend5;

public class Test {
    public static void main(String[] args) {
        Husky d1 = new Husky();
        d1.eat();
        d1.drink();
        d1.lookHome();
        d1.breakHome();
        System.out.println("--------");
        spDog d2 = new spDog();
        d2.eat();
        d2.drink();
        d2.lookHome();
        System.out.println("--------");
        ChineseDog d3 = new ChineseDog();
        d3.eat();
        d3.drink();
        d3.lookHome();
    }
}
