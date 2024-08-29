package arr.ArrAndMethod;
import java.util.Scanner;
public class IsRelativeTo7 {
    public static int isRel7(int num) {
        if (num % 7 == 0) {
            return 1;
        }
        //判断每一位数 是否有7
        while (num > 0) {
            if (num % 10 == 7) {
                return 1;
            }
            num /= 10;
        }
        return 0;
    }
    public static int sumOf7(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (isRel7(i) == 0) {
                sum += i * i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] results = new int[T];
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            results[t] = sumOf7(N);
        }
        for (int i = 0; i < T; i++) {
            System.out.println(results[i]);
        }
    }
}