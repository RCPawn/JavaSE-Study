package map.map;

import java.util.HashMap;
import java.util.Map;

public class demo1 {
    public static void main(String[] args) {
        //1.创建Map集合
        Map<String, String> m = new HashMap<>();

        //2.添加put
        m.put("1", "懒洋洋");
        m.put("2", "史迪仔");
        m.put("3", "蜡笔小新");
        //key存在，将被覆盖的的value返回，key不存在，将被覆盖的null返回
        String val = m.put("1", "小猪佩奇");

        //3.删除remove
        String res = m.remove("3");

        //4.判断是否存在containsKey, containsValue
        boolean k = m.containsKey("1");
        boolean v = m.containsValue("史迪仔");

        //5.判断是否为空isEmpty
        boolean e = m.isEmpty();

        //6.长度size
        int size = m.size();

        //7.清空clear
        m.clear();

        //7.打印
        System.out.println(m);
    }
}
