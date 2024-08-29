package map.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class demo2 {
    public static void main(String[] args) {
        //定义一个数组存储4个景点
        String[] arr = {"A", "B", "C", "D"};

        //利用随机数模拟80个同学的投票，并将投票结果存储起来
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        //定义map集合
        HashMap<String, Integer> hm = new HashMap<>();
        for (String name : list) {
            if (hm.containsKey(name)) {
                int cnt = hm.get(name);
                cnt++;
                hm.put(name, cnt);
            } else {
                hm.put(name, 1);
            }
        }
        System.out.println(hm);

        //统计哪个景点想去的人多
        int max = 0;
        Set<String> names = hm.keySet();
        for (String name : names) {
            int cnt = hm.get(name);
            max = Math.max(max, cnt);
        }

        //把获得投票最多的景点名打印出来
        for (String name : names) {
            int cnt = hm.get(name);
            if (cnt == max) {
                System.out.println(name);
            }
        }
    }
}
