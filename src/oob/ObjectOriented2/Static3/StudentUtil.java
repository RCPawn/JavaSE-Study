package oob.ObjectOriented2.Static3;

import java.util.ArrayList;

public class StudentUtil {

    //防止了在类外部创建该类的实例
    private StudentUtil() {
    }

    public static int getMaxAgeStudent(ArrayList<Student> list) {
        //定义一个参照物
        int max = list.get(0).getAge();

        for (int i = 0; i < list.size(); i++) {
            int age = list.get(i).getAge();
            if (age > max) {
                max = age;
            }
        }
        return max;
    }
}
