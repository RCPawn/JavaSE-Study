package oob.ObjectOriented4.InnerClass1;

public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show(){
        // 打印调用者车的名字
        System.out.println(carName);

        //外部类要访问内部类的对象就要创建内部类的对象
        Engine e = new Engine();
        System.out.println(e.engineName);
    }

    // 成员内部类
    class Engine{
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(engineName);
            // 内部类可以直接访问外部类的成员 包括私有
            System.out.println(carName);
        }
    }
}
