package arr.ArrAndMethod.Case;

import java.util.Scanner;

public class JudgeScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入6个分数:");
        int[] score = new int[6];
        for (int i = 0; i < 6; i++) {
            score[i] = sc.nextInt();
        }

        int max = findMax(score);
        int min = findMin(score);
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += score[i];
        }
        int average = (sum - max - min) / 4;
        System.out.println("去掉一个最大值和一个最小值后的平均分：" + average);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}