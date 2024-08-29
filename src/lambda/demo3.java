package lambda;

import java.util.Arrays;

public class demo3 {
    public static void main(String[] args) {
        String[] arr = {"1", "55555", "333", "22", "4444"};

        /*Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                // 按照字符串的长度进行排序
                return o1.length() - o2.length();
            }
        });*/

        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

        System.out.println(Arrays.toString(arr));
    }
}
