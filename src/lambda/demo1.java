package lambda;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};

        //匿名内部类
        /**Arrays.sort(arr,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/

        //lambda 表达式 JDK8
        /**Arrays.sort(arr,(Integer o1, Integer o2) -> {
                return o2 - o1;
            });*/

        Arrays.sort(arr, (o1, o2) -> o2 - o1);

        System.out.println(Arrays.toString(arr));
    }
}
