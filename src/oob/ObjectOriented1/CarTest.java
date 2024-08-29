package oob.ObjectOriented1;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //创建一个数组 存取三个汽车对象
        Car[] arr = new Car[3];

        //存取汽车对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //要放在循环里面 表示有三辆车的对象
            Car c = new Car();

            //键盘录入品牌
            System.out.println("brand:");
            String brand = sc.next();
            c.setBrand(brand);
            //录入价格
            System.out.println("price:");
            int price = sc.nextInt();
            c.setPrice(price);
            //录入颜色
            System.out.println("color:");
            String color = sc.next();
            c.setColor(color);

            //把汽车对象添加到数组当中
            arr[i] = c;
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + "  " + car.getPrice() + "  " + car.getColor());
        }
    }
}
