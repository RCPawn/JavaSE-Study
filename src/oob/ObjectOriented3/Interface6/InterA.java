package oob.ObjectOriented3.Interface6;

public interface InterA {
    public abstract void method();

    // 默认方法不是抽象方法 不强制被重写
    // 接口里面写带有方法体的方法要加上 default
    public default void show(){
        System.out.println("InterA 接口中的默认方法 --- show");
    }
}
