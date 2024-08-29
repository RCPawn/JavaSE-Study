package arr.ArrAndMethod;

public class MethodOverload {
    //方法重载 同一个类中 方法名相同 参数个数或类型不同 不看返回值
    public static void compare(int a, int b) {
        System.out.println("int");
        System.out.println(a==b);
    }

    public static void compare(byte a, byte b) {
        System.out.println("byte");
        System.out.println(a==b);
    }

    public static void compare(short a, short b) {
        System.out.println("short");
        System.out.println(a==b);
    }

    public static void compare(long a, long b) {
        System.out.println("long");
        System.out.println(a==b);
    }


    public static void main(String[] args) {
        //实参形参一一对应
        compare(1,2);
        System.out.println("\n");
        compare((byte)1,(byte)2);
        System.out.println("\n");
        compare((short)5,(short)5);
        System.out.println("\n");
        compare(5,(long)3);
    }
}