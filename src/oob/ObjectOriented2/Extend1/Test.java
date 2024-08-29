package oob.ObjectOriented2.Extend1;

public class Test {
    public static void main(String[] args) {
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMice();
        System.out.println("--------------");
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.destroyHome();
        h.guardHouse();
    }
}