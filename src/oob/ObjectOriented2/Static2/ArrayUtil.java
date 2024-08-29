package oob.ObjectOriented2.Static2;

import java.util.StringJoiner;

//工具类
public class ArrayUtil {
    private ArrayUtil() {

    }

    //遍历数组
    public static String printArr(int[] arr) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        return sj.toString();
    }

    //求平均
    public static double getAverage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }
}
