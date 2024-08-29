package oob.ObjectOriented2.Static2;

public class TestDemo {
    public static void main(String[] args) {
        //测试工具类中的两个方法

        int[] arr1 = {1,2,3,4,5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.2,1.3,1.5,1.5};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
