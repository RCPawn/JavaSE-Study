package map.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "懒洋洋");
        map.put("2", "小猪佩奇");
        map.put("3", "蜡笔小新");

        //Map集合的三种遍历方式
        //1.键找值
        //1.1获取所有的键，并将所有的键放到一个单列集合中
        Set<String> keys = map.keySet();
        for (String key : keys) {
            //1.2利用键找值
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        //2.键值对
        //2.1通过方法获取所有的键值对对象
        for (Map.Entry<String, String> entry : map.entrySet()) {
            //2.2通过entry调用方法获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        //3.Lambda表达式
        map.forEach((key, value) -> System.out.println(key + "=" + value));

    }
}
