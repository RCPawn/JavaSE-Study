package test1;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(getCount1(20));
        System.out.println(getCount2(20));
    }

    //效率高
    public static int getCount1(int step) {
        int p = 0, q = 0, r = 1;
        for (int i = 0; i < step; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    //递归
    public static int getCount2(int step) {
        if (step == 1) {
            return 1;
        } else if (step == 2) {
            return 2;
        } else if (step == 3) {
            return 4;
        }
        return getCount2(step - 1) + getCount2(step - 2) + getCount2(step - 3);
    }
}