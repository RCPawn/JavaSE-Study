package oob.ObjectOriented3.Interface6;

// JDK8 考虑到接口升级
// 接口中可以有带方法体的方法（静态 默认）
public class Test {
    public static void main(String[] args) {

        InterImpl ii = new InterImpl();
        ii.method();
        ii.show();
    }
}
