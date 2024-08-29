package arr.ArrAndMethod.Case;

import java.util.Scanner;

public class fibArr {
    static final int mod = 1000000009;

    static class Matrix {
        long[][] m = new long[2][2];
    }

    static Matrix mul(Matrix A, Matrix B) {
        Matrix ret = new Matrix();
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                ret.m[i][j] = 0;
                for (int k = 0; k < 2; k++)
                    ret.m[i][j] = (ret.m[i][j] + A.m[i][k] * B.m[k][j] % mod) % mod;
            }
        return ret;
    }

    static Matrix pow(Matrix A, long n) {
        Matrix ret = new Matrix();
        ret.m[0][0] = 1;
        ret.m[0][1] = 0;
        ret.m[1][0] = 0;
        ret.m[1][1] = 1;
        while (n > 0) {
            if ((n & 1) == 1)
                ret = mul(ret, A);
            A = mul(A, A);
            n >>= 1;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Matrix ans = new Matrix();
        Matrix A = new Matrix();
        ans.m[0][0] = 1;
        ans.m[0][1] = 0;
        A.m[0][0] = 1;
        A.m[0][1] = 1;
        A.m[1][0] = 1;
        A.m[1][1] = 0;

        ans = mul(ans, pow(A, n - 1));
        System.out.println(ans.m[0][0]);
        scanner.close();
    }
}