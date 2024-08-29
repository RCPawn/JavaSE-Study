package oob.ObjectOriented2.Extend6;

public class Person {
    String name;
    int age;

    public Person() {
        // 调用本类的其他构造方法
        // 此时虚拟机就不会自动创建 super()
        // 默认值
        // this("懒洋洋",19);

        System.out.println("父类的无参构造");
    }

    public Person(String name, int age) {
        //给对象里面的属性赋值
        this.name = name;
        this.age = age;
    }
}