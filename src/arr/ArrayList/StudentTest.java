package arr.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            //1.创建学生对象
            Student s= new Student();

            System.out.println("录入姓名:");
            String name =sc.next();
            s.setName(name);

            System.out.println("录入年龄:");
            int age = sc.nextInt();
            s.setAge(age);

            //2.添加学生对象
            list.add(s);
        }

        //因为有 toString 方法 直接打印
        System.out.println(list);
    }
}
