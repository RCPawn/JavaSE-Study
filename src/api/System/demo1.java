package api.System;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
//        System.exit(0); 停止虚拟机

        /*获取当前毫秒值
        long l = System.currentTimeMillis();
        System.out.println(l);*/

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        System.arraycopy(arr1, 0, arr2, 0, 5);
        System.out.println(Arrays.toString(arr2));
    }
}
