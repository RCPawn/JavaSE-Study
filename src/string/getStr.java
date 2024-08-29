package string;

public class getStr {
    public static void main(String[] args) {
        // 1 使用赋值地方式来获取一个字符串
        String s1 = "abc";
        System.out.println(s1);

        // 2 使用 new 的方式来获取一个字符串
        String s2 = new String();  // 空参构造
        System.out.println("@" + s2 + "!");

        // 3 传递一个字符串 根据传递的字符串内容再创建一个新的字符串对象
        String s3 = new String("abc");
        System.out.println(s3);

        // 4 传递一个字符数组 根据字符数组的内容再创建一格新的字符串对象
        /* 注：字符串不能发生变化 要修改就转换成字符数组 */
        char[] chs = {'a', 'b', 'c', 'd'};
        String s4 = new String(chs);
        System.out.println(s4);

        // 5 传递一个字节数组 根据字节数组的内容再创建一个新的字符串对象
        /* 注：以后在网络当中传输的数据其实都是字节信息
           一般要把字节信息进行转换 转成字符串 此时就要用到这个构造 */
        byte[] bytes = {97, 98, 99, 100};  //里面的数字分别对应 a b c d
        String s5 = new String(bytes);
        System.out.println(s5);

    }
}
