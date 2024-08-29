package oob.ObjectOriented4.InnerClass5;

public class Outer {

    public void show(){
        final int a = 10;

        // 局部内部类 和局部变量类似
        // 外界无法直接使用 需要在方法里面创建对象使用
        class Inner{
            String name;
            int age;

            public void method1(){
                System.out.println("局部内部类中的 method1 方法");
            }
            public static void method2(){
                System.out.println("局部内部类中的 method2 静态方法");
            }
        }

        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        Inner.method2(); // 静态的直接类名点调用
    }
}
