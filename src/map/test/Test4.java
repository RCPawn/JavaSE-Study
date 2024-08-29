package map.test;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        ArrayList<String> city1 = new ArrayList<>();
        Collections.addAll(city1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");

        ArrayList<String> city2 = new ArrayList<>();
        Collections.addAll(city2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");

        ArrayList<String> city3 = new ArrayList<>();
        Collections.addAll(city3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        hm.put("江苏省", city1);
        hm.put("湖北省", city2);
        hm.put("河北省", city3);

        Set<String> keys = hm.keySet();
        for (String key : keys) {
            ArrayList<String> cities = hm.get(key);
            StringJoiner sj = new StringJoiner(", ", "", "");
            for (String city : cities) {
                sj.add(city);
            }
            System.out.println(key + " = " + sj);
        }
    }
}
