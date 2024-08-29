package oob.ObjectOriented2.Extend3;

public class Sun extends Father{
    String name = "sun";
    String hobby = "吃鸡";

    public void show(){
        //打印 sun
        System.out.println(name);

        //打印 father
        System.out.println(super.name);

        //打印 吃鸡
        System.out.println(hobby);

        //打印 喝茶
        System.out.println(super.hobby);
    }
}
