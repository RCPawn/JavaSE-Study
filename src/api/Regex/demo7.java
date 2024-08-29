package api.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo7 {
    public static void main(String[] args) {

        String s = "来黑马程序员学习Java，" +
                "电话:18512516758，18512508907" +
                "或者联系邮箱:boniu@itcast.cn，" +
                "座机电话:01036517895，010-98951256" +
                "邮箱:bozai@itcast.cn，" +
                "热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090";

        String regex = "(1[3-9]\\d{9})" + // 匹配手机号码
                "|([\\w.-]+@[\\w]+\\.[a-zA-Z]{2,3})" + // 匹配邮箱
                "|(0[1-9]\\d{1,2}-?[1-9]\\d{4,9})" + // 匹配座机电话
                "|(400-?\\d{3}-?\\d{4})"; // 匹配热线电话

        //1.获取正则表达式的对象
        Pattern p = Pattern.compile(regex);

        //2.获取文本匹配器的对象
        //利用m去读取s，会按照p的规则找里面的小串
        Matcher m = p.matcher(s);
        //3.利用循环获取每一个数据
        while (m.find()) {
            String str = m.group();
            System.out.println(str);
        }
    }
}