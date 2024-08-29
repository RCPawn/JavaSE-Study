package oob.ObjectOriented3.Interface7;

public class InterImpl implements Inter {
    @Override
    public void method() {
        System.out.println("InterImpl 重写的抽象方法");
    }

    // 静态方法不能被重写
}
