package oob.ObjectOriented4.InnerClass2;

public class Test {
    public static void main(String[] args) {
        // 链式编程
        /**Outer o = new Outer();
        System.out.println(o.name);
        System.out.println(new Outer().name);*/

        // 创建内部类对象
        // Outer.Inner oi = new Outer().new Inner();

        Outer o = new Outer();
        Object Inner = o.getInstance(); // 1 多态

        System.out.println(o.getInstance()); // 2 不用变量接受
    }
}
