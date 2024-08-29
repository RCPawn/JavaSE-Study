package oob.ObjectOriented4.InnerClass3;

public class Outer {

    private int a = 10;

    class Inner{
        private int a = 20;

        public void show(){
            int a = 30;
            System.out.println(a); //30 就近原则
            System.out.println(new Inner().a); //20
            System.out.println(new Outer().a); //10

            System.out.println("-------");

            System.out.println(a); //30
            System.out.println(this.a); //20
            System.out.println(Outer.this.a); //10 Outer.this 就是获取了外部类对象的地址值
        }

    }
}
