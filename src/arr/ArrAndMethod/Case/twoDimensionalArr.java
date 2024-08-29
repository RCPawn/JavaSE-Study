package arr.ArrAndMethod.Case;

public class twoDimensionalArr {

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] yearArrArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };

        //全年的营业额
        int yearSum = 0;
        //遍历数组
        for (int i = 0; i < yearArrArr.length; i++) {
            int[] quarterArr = yearArrArr[i];
            int sum = getSum(quarterArr);
            yearSum += sum;
            System.out.println("第" + (i + 1) + "个季度的总营业额：" + sum);
        }

        System.out.println("全年的总营业额：" + yearSum);

    }
}