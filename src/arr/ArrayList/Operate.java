package arr.ArrayList;

import java.util.ArrayList;

public class Operate {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //1.添加
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        list.add("ggg");

        //2.删除
        boolean result = list.remove("aaa"); //判断是否删除成功

        String s1 = list.remove(0);

        //3.修改
        String s2 = list.set(1,"ddd");

        //4.查询
        String s3 = list.get(3);
    }
}