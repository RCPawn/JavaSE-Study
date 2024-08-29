package oob.ObjectOriented3.Interface8;

public interface InterA {
    public default void show1(){
        System.out.println("show1 方法执行...");
    }

    public default void end(){
        System.out.println("show2 方法执行...");
    }

    //普通的私有方法 给默认方法服务的
    private void show3(){
        System.out.println("记录程序在运行过程中的各种细节，这里有 100 行代码");
    }

    //静态的私有方法 给静态方法服务的
    private static void show4(){
        System.out.println("记录程序在运行过程中的各种细节，这里有 100 行代码");
    }
}
