package oob.ObjectOriented4.InnerClass2;

// JDK16 开始可以定义静态变量
public class Outer {
    String name;

    // 成员内部类可以用 private 修饰
    // private 修饰后 外部不能直接创建其对象
    private class Inner{

    }

    // 编写方法 对外提供内部类对象
    public Inner getInstance(){
        return new Inner();
    }
}
