package api.bigInteger;

import java.math.BigInteger;
import java.util.Random;

public class demo1 {
    public static void main(String[] args) {
        Random r = new Random();
        // 获取一个随机的大整数 numBits 比特位
        /*BigInteger bd1 = new BigInteger(4,r);
        System.out.println(bd1);

        // 获取一个指定的大整数
        // 字符串中必须是整数
        BigInteger bd2 = new BigInteger("9999999999999999999");
        System.out.println(bd2);*/

        // 获取指定进制的大整数
        // 二进制中只有 0 和 1 字符串中的数字必须和进制数吻合
        // 将 1100 转换成二进制
        BigInteger bd4 = new BigInteger("1100", 2);
        // 将 1100 转换成十进制
        BigInteger bd5 = new BigInteger("1100", 10);
        System.out.println(bd4);
        System.out.println(bd5);

        // 静态方法获取 BigInteger 的对象
        // 范围在 long 的范围内
        // 内部有优化 -16 ~ 16进行了优化
        BigInteger bd6 = BigInteger.valueOf(9223372036854775807l);
        System.out.println(bd6);

        // 对象一旦创建 里面的数据不能改变
        BigInteger bd7 = BigInteger.valueOf(1);
        BigInteger bd8 = BigInteger.valueOf(2);
        // 只要进行计算 都会产生一个新的对象
        BigInteger result = bd7.add(bd8);
        System.out.println(result);

    }
}