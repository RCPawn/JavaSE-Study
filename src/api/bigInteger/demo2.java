package api.bigInteger;

import java.math.BigInteger;

public class demo2 {
    public static void main(String[] args) {
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        // 加法
        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);

        // 除法获取商和余数
        boolean result = bd1.equals(bd2);
        System.out.println(result);

        // 次幂
        BigInteger bd4 = bd1.pow(2);
        System.out.println(bd4);

        // max
        BigInteger bd5 = bd1.max(bd2);
        System.out.println(bd5);

        // 转换成 int 类型整数 超出范围数据有误
        BigInteger bd6 = BigInteger.valueOf(2147483648l);
        int i = bd6.intValue();
        System.out.println(i);
    }
}