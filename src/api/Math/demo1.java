package api.Math;

public class demo1 {
    public static void main(String[] args) {
        // 1.abs
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));

        // JDK15 超出范围程序报错
        // System.out.println(Math.absExact(-2147483648));

        System.out.println(Math.abs(-2147483648)); // bug
        System.out.println(Math.abs(-2147483647));

        // 2.ceil
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.99));

        System.out.println(Math.ceil(-12.34));
        System.out.println(Math.ceil(-12.99));

        // 3.floor
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.99));

        System.out.println(Math.floor(-12.34));
        System.out.println(Math.floor(-12.99));

        // 4.round
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.99));

        System.out.println(Math.round(-12.34));
        System.out.println(Math.round(-12.99));

        // 5.max min
        System.out.println(Math.max(20,30));
        System.out.println(Math.min(20,30));

        // 6. a 的 b 次幂
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(4, 0.5));
        System.out.println(Math.pow(2, -2));

        // 7.sqrt
        System.out.println(Math.sqrt(4));

        // 8.cbrt
        System.out.println(Math.cbrt(8));

        // 9.random (0.0 ~ 1.0)
    }
}