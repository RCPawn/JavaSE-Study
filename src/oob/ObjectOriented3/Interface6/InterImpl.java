package oob.ObjectOriented3.Interface6;

public class InterImpl implements InterA,InterB {
    @Override
    public void method() {
        System.out.println("实现类重写的抽象方法");
    }

    //重写时不写 default
    @Override
    public void show() {
        System.out.println("重写接口中的默认方法");
    }
}
