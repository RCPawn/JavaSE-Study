package oob.ObjectOriented4.InnerClass4;

public class Outer {
    // 静态内部类 成员内部类中的一种
    static class Inner {
        public void show1(){
            System.out.println("非静态方法被调用了");
        }

        public static void show2(){
            System.out.println("静态方法被调用了");
        }
    }

}
