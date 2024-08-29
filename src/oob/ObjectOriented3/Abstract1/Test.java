package oob.ObjectOriented3.Abstract1;

public class Test {
    public static void main(String[] args) {
        // 创建对象
        // Person p = new Person(); 抽象类不能创建对象实例化

        // 抽象类可以有构造方法
        // 作用 当创建子类对象时 给属性赋值
        Student s = new Student("懒洋洋",19);

        System.out.println(s.getName() + ", " + s.getAge());
    }
}
