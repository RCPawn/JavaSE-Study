package oob.ObjectOriented4.InnerClass4;

public class Test {
    // 静态的东西可以直接用类名点直接获取
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();
        oi.show1();

        Outer.Inner.show2();
    }
}
