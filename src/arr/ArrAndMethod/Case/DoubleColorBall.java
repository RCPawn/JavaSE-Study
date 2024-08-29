package arr.ArrAndMethod.Case;

import java.util.Random;
import java.util.Scanner;

public class DoubleColorBall {

    public static void main(String[] args) {
        //生成中奖号码
        int[] arr = createNum();

        System.out.println("===========================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("===========================");
        //用户输入彩票号码（红球 + 蓝球）
        int[] userInputNum = userInputNum();
        int redCount = 0;
        int blueCount = 0;
        //判断红球
        for (int i = 0; i < userInputNum.length - 1; i++) {
            int redNumber = userInputNum[i];
            for (int j = 0; j < userInputNum.length - 1; j++) {
                if (redNumber == arr[i]) {
                    redCount++;
                    //如果找到了，后面的数字就没有必要比较了
                    //跳出内循环继续判断下一个红球号码是否中奖
                    break;
                }
            }
        }
        //判断蓝球
        int blueNumber = userInputNum[userInputNum.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }
        //判断中奖情况
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你中奖1000万！");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你中奖500万！");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你中奖3000块！");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你中奖200块！");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你中奖10块！");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你中奖5块！");
        } else {
            System.out.println("恭喜你没中奖！");
        }

    }

    //用户输入彩票号码
    public static int[] userInputNum() {
        Scanner sc = new Scanner(System.in);
        //输入红球号码
        int[] arr = new int[7];
        for (int i = 0; i < 6; ) {
            System.out.println("输入第" + (i + 1) + "个红球号码:");
            int red = sc.nextInt();
            if (red >= 1 && red <= 33) {
                if (!contains(arr, red)) {
                    arr[i] = red;
                    i++;
                } else {
                    System.out.println("当前红球号码已经存在，请重新输入！");
                }
            } else {
                System.out.println("当前红球号码超出范围！");
            }
        }
        //用 while 循环超出范围后重新输入 直到在范围内
        while (true) {
            System.out.println("输入蓝球号码：");
            int blue = sc.nextInt();
            if (blue >= 1 && blue <= 16) {
                arr[arr.length - 1] = blue;
                break;
            } else {
                System.out.println("当前蓝球号码超出范围！");
            }
        }

        return arr;
    }

    public static boolean contains(int[] arr, int price) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == price) {
                return true;
            }
        }
        return false;
    }

    //生成中奖号码
    public static int[] createNum() {

        Random rd = new Random();
        int[] arr = new int[7];
        //生成红色球号码
        for (int i = 0; i < 6; ) {
            int red = rd.nextInt(33) + 1;
            if (!contains(arr, red)) {
                arr[i] = red;
                i++;
            }
        }
        //生成蓝色球号码
        int blue = rd.nextInt(16) + 1;
        arr[arr.length - 1] = blue;
        return arr;
    }

}