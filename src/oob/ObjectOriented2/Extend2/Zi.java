package oob.ObjectOriented2.Extend2;

public class Zi extends Fu{
    String name = "Zi";

    public void ziShow(){
        String name = "ziShow";
        //就近使用
        System.out.println("name---" + name); // ziShow
        System.out.println("this.name---" + this.name); // Zi
        //父类
        System.out.println("super.name---" + super.name); // Fu
        //父类的父类 Ye 的 name 访问不到 只能调用一个 super
    }
}
