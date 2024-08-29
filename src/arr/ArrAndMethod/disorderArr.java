package arr.ArrAndMethod;

import java.util.Random;
import java.util.Scanner;

public class disorderArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("要打乱的数组长度:");
        int n = sc.nextInt();
        Random r = new Random();
        int[] arr = new int[n];

        System.out.println("要存进数组的元素:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int x = r.nextInt(n);
            int temp = arr[i];
            arr[i] = arr[x];
            arr[x] = temp;
        }

        System.out.println("打乱后的数组:");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}
