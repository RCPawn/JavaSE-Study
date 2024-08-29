package arr.ArrAndMethod.Case;

import java.util.Scanner;

public class PlaneTickets {

    static double getPrice(double price, int cabin, double discount0, double discount1) {
        double discountedPrice = 0;
        if (cabin == 0) {
            discountedPrice = price * discount0;
        } else if (cabin == 1) {
            discountedPrice = price * discount1;
        } else {
            System.out.println("没有这个舱位！");
        }
        return discountedPrice;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("price:");
        double price = sc.nextDouble();

        System.out.println("month:");
        int month = sc.nextInt();

        System.out.println("cabin 0头等舱 1经济舱:");
        int cabin = sc.nextInt();

        double discountedPrice = 0;

        if (month >= 5 && month <= 10) {
            discountedPrice=getPrice(price, cabin, 0.9, 0.85);
        } else {
            discountedPrice=getPrice(price, cabin, 0.7, 0.6);
        }

        System.out.println("折后价格:" + discountedPrice);
    }
}