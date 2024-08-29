package api.MyDate;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数：");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            if (num < 1 || num > 100){
                System.out.println("数字不在1-100范围内，请重新输入！");
            } else {
                list.add(num);
            }
            int sum = getSum(list);
            if (sum > 200){
                System.out.println("集合中所有数据和已经满足要求！");
                break;
            }
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            sum += num;
        }
        return sum;
    }
}
