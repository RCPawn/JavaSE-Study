package map.args;

public class demo1 {
    public static void main(String[] args) {
        System.out.println(getSum(1, 1));
    }

    public static int getSum(int a, int b){
        return a + b;
    }

    public static int getSum(int a, int b, int c){
        return a + b + c;
    }

    public static int getSum(int a, int b, int c, int d){
        return a + b + c + d;
    }
}
