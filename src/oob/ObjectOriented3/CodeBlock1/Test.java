package oob.ObjectOriented3.CodeBlock1;

public class Test {
    public static void main(String[] args) {
        // 局部代码块
        /*{
            int a = 10;
        }  代码执行到这儿 a 就从内存中消失了*/

        // System.out.println(a);

        // 构造代码块
        Student s1 = new Student();
        System.out.println("------------");
        Student s2 = new Student("懒洋洋",10);
    }
}
