package oob.ObjectOriented3.Interface5;

public class Test {
    public static void main(String[] args) {
        BtPlayer p1 = new BtPlayer("詹姆斯",40);
        System.out.println(p1.getName() + ", " + p1.getAge());
        p1.study();

        PpPlayer p2 = new PpPlayer("马龙",30);
        System.out.println(p2.getName() + ", " + p2.getAge());
        p2.study();

        BtCoach c1 = new BtCoach("蓝球教练",50);
        System.out.println(c1.getName() + ", " + c1.getAge());
        c1.teach();

        PpCoach c2 = new PpCoach("乒乓球教练",51);
        System.out.println(c2.getName() + ", " + c2.getAge());
        c2.teach();
    }
}