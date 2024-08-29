package map.treeMap;

import java.util.TreeMap;

public class demo3 {
    public static void main(String[] args) {
        /*
        统计：
        默认使用：HashMap
        要求排序：TreeMap

        需求：统计字符串中每个字符出现的次数
        输出格式：a(5) b(4) c(3) d(2) e(1)
         */
        String s = "aababcabcdabcde";
        TreeMap<Character, Integer> tm = new TreeMap<>();

        //统计次数
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (tm.containsKey(c)) {
                int cnt = tm.get(c);
                cnt++;
                tm.put(c, cnt);
            } else {
                tm.put(c, 1);
            }
        }

        //调整输出格式
        //StringJoiner sj = new StringJoiner("","","");
        StringBuilder sb = new StringBuilder();
        tm.forEach((key, val) -> sb.append(key).append("(").append(val).append(")").append(" "));
        System.out.println(sb);
    }
}
