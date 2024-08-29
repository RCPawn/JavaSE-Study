package oob.ObjectOriented2.Static3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //创建集合存储学生对象
        ArrayList<Student> list = new ArrayList<>();

        //创建三个学生对象
        Student stu1 = new Student("蜡笔小新",19,"男");
        Student stu2 = new Student("小猪佩奇",18,"女");
        Student stu3 = new Student("懒洋洋",20,"男");

        //把学生对象添加到集合当中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //调用方法求年龄最大值
        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);
    }
}
