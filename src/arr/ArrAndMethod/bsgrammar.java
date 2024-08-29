package arr.ArrAndMethod;

public class bsgrammar {

    public static void main(String[] args) {
        //1.隐式转换
        /*取值范围 byte<short<int<long<float<double
        数据类型不一样，不能进行计算，需要转成一样的才能进行计算
        取值范围小的，会先提升为大的，再进行计算
        byte short char 这三种类型的数据在运算的时候，都会直接先提升为int，然后再进行运算*/
        //2.强制转换
        byte b1 = 10;
        byte b2 = 20;
        byte result = (byte) (b1 + b2);

        System.out.println(result);//30
        System.out.println(3.7 + "abc");//3.7abc
        System.out.println("abc" + true);//abctrue
        System.out.println(1 + 2 + "abc" + 2 + 1);//3abc21
        //字符相加
        System.out.println('a' + 1);//98
        //只要有字符串就是拼接操作
        System.out.println('a' + "abc");//aabc

        //3.短路逻辑运算符
        int a = 10;
        int b = 10;
        boolean c = ++a < 5 && ++b < 5;//换成 & 前后语句均要执行
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        //4.三元运算符 最大值
        int number1 = 10;
        int number2 = 20;
        int max = number1 > number2 ? number1 : number2;
        System.out.println(max);
        //5.运算符优先级 小括号优先于所有

    }
}
