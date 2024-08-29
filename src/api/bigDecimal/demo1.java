package api.bigDecimal;

import java.math.BigDecimal;

public class demo1 {
    public static void main(String[] args) {
        // 表示很大的小数
        // 1.这种方式不精确
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        System.out.println(bd1);
        System.out.println(bd2);

        // 2.小数的精确运算
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        BigDecimal bd5 = bd3.add(bd4);
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5);

        // 3.通过静态方法获取对象
        BigDecimal bd6 = BigDecimal.valueOf(10);
        BigDecimal bd7 = BigDecimal.valueOf(10);
        System.out.println(bd6);

        //细节
        // 如果表示的数字没有超过 double 的范围 建议用静态方法
        // 如果表示的数字比较大 用构造方法
        // 0 ~ 10 的整数之间有优化 不会创建新的对象 节约内存
        System.out.println(bd6 == bd7); // true

    }
}
