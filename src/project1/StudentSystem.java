package project1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {

    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String QUERY_STUDENT = "4";
    private static final String EXIT = "5";

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("-------------欢迎来到学生管理系统------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);

            String choose = sc.next();

            switch (choose) {
                case ADD_STUDENT -> addStudent(list);
                case DELETE_STUDENT -> deleteStudent(list);
                case UPDATE_STUDENT -> updateStudent(list);
                case QUERY_STUDENT -> queryStudent(list);
                case EXIT -> {
                    System.out.println("退出");
//                    break loop;
                    System.exit(0); //停止虚拟机运行
                }
                default -> System.out.println("没有这个选项！");
            }
        }

    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        while (true) {
            System.out.println("请输入学生的id:");
            String id = sc.next();

            //id 唯一
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("当前 id 已存在，请重新录入！");
            } else {
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的姓名:");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生的年龄:");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生的家庭地址:");
        String address = sc.next();
        s.setAddress(address);

        //把学生对象添加到集合当中
        list.add(s);

        //提示添加情况
        System.out.println("学生信息添加成功！");
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要删除的学生 id :");
        String sid = sc.next();

        int index = getIndex(list, sid);
        if (index >= 0) {
            list.remove(index);
            System.out.println("id为" + sid + "的学生信息删除成功！");
        } else {
            System.out.println("当前 id 不存在，删除失败！");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要修改学生的 id :");
        String sid = sc.next();

        //输入的 id 是否存在
        int index = getIndex(list, sid);
        if (index == -1) {
            System.out.println("id为" + sid + "的学生不存在，修改失败！");
            return;
        }

        //获取要修改的学生对象
        Student stu = list.get(index);

        //输入信息并修改
        System.out.println("请输入要修改的学生姓名:");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入要修改的学生年龄:");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入要修改的学生家庭住址:");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("id为" + sid + "的学生信息修改成功！");

    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("无学生信息，请添加后查询！");
            return;
        }

        //打印表头信息
        System.out.println("id\t\t姓名\t年龄\t家庭住址");

        //当代码执行到这儿表示 list 里面是有信息的
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t " + stu.getAge() + "\t\t" + stu.getAddress());
        }
    }

    //判断 id 在集合中是否存在
    public static boolean contains(ArrayList<Student> list, String id) {
        /*for (int i = 0; i < list.size(); i++) {
            boolean flag = list.get(i).getId().equals(id);
            if (flag) {
                return true;
            }
        }
        return false;*/
        return getIndex(list, id) >= 0;
    }

    //通过 id 获取索引
    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            String sid = s.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }

}