package api.Object;

public class demo1 {
    public static void main(String[] args) {
        Student s1 = new Student("懒洋洋",19);
        Student s2 = new Student("懒洋洋",19);
        Student s3 = new Student("懒洋洋",19);

        // 打印对象默认打印的是地址值
        // 想要看到属性值 重写 Object 父类中的 toString 方法就行
        System.out.println(s1);
    }
}