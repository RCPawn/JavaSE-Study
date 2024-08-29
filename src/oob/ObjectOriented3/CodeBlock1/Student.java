package oob.ObjectOriented3.CodeBlock1;

public class Student {
    private String name;
    private int age;

    // 构造代码块
    {
        System.out.println("创建对象");
    }

    public Student() {
        System.out.println("空参构造");
    }

    public Student(String name, int age) {
        System.out.println("带参构造");
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
}
