package oob.ObjectOriented2.Extend4;

public class OverseaStudent extends Person{
    public void lunch(){
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }

    //子类重写父类方法时：
    //当父类方法不能满足子类需求时 方法重写
    //访问权限必须大于父类
    //返回值类型必须小于等于父类
    //重写方法时尽量和父类保持一致
    //只有能添加到虚方法表里面的方法才能被重写 private static
    @Override
    public void eat(){
        System.out.println("吃意大利面");
    }

    @Override
    public void drink(){
        System.out.println("喝凉水");
    }
}
