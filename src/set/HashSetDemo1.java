package set;

//默认去重
public class HashSetDemo1 {
    public static void main(String[] args) {

        //1.创建对象
        Student1 s1 = new Student1("懒洋洋", 20);
        Student1 s2 = new Student1("懒洋洋", 20);

        //2.如果没有重写hashCode方法，不同对象计算出的哈希值是不同的
        System.out.println(s1.hashCode()); //773718883
        System.out.println(s2.hashCode()); //773718883
    }
}
