package arr.ArrAndMethod.Case;

import java.util.Random;

public class redPocketPlus {

    public static void disorder(int[] arr) {
        Random rd = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rd.nextInt(i + 1);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        disorder(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}