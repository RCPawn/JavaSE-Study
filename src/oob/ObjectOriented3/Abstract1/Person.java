package oob.ObjectOriented3.Abstract1;


public abstract class Person {

    private String name;
    private int age;

    // 1.抽象类
    // 可以有构造方法
    // 当创建子类对象时 给属性赋值
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void work();

    // 抽象类不一定有抽象方法 有抽象方法的类一定是抽象类
    public void sleep(){
        System.out.println("睡觉");
    }
}
