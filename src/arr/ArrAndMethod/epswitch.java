package arr.ArrAndMethod;

import java.util.Scanner;

public class epswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("要吃：");
        String noodles = sc.nextLine();
       /*case 穿透
            就是语句体中没有break 语句导致的
            执行流程：
                首先还是会拿着小括号中表达式的值跟下面每一个case进行匹配，
                如果匹配上了，就会执行对应的语句体，如果此时发现了break，那么结束整个switch语句。
        如果没有发现break，那么程序就会执行下一个case语句体，一直遇到break或者右大括号。*/

       /* switch (noodles) {
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃泡面");
                break;*/
        //JDK 12 推出
        switch (noodles) {
            case "兰州拉面" -> System.out.println("吃兰州拉面");

            case "武汉热干面" -> System.out.println("吃武汉热干面");

            case "北京炸酱面" -> System.out.println("吃北京炸酱面");

            case "陕西油泼面" -> System.out.println("吃陕西油泼面");

            default -> System.out.println("没有这个选项");

        }
    }
}
