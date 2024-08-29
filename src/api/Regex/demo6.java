package api.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo6 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用得最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //1.获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");

        //2.获取文本匹配器的对象
        Matcher m = p.matcher(str);

        //3.利用循环来获取
        while (m.find()){
            String s = m.group();
            System.out.println(s);
        }
    }
}