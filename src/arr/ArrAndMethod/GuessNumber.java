package arr.ArrAndMethod;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        //计数器 保底机制
        int count = 0;
        // 生成7到100之间的随机数字
        int randomNumber = rd.nextInt(94) + 7;
        System.out.println("猜猜看我心里想的数字是多少（7到100之间）:");

        int userGuess = 0;
        while (userGuess != randomNumber) {
            try {
                userGuess = sc.nextInt();
                if (userGuess > randomNumber)
                    System.out.println("猜大了");
                else if (userGuess < randomNumber)
                    System.out.println("猜小了");
            } catch (InputMismatchException e) {
                System.out.println("请输入一个有效的整数！");
                // 清除输入缓冲区中的非整数值
                sc.next();
            }
            count++;
        }
        System.out.println("恭喜你，猜对了！你猜了" + count + "次。");
        sc.close();
    }
}