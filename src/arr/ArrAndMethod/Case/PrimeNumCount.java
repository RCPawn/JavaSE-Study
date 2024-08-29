package arr.ArrAndMethod.Case;

public class PrimeNumCount {

    public static void main(String[] args) {
        int count = 0;
        System.out.println("101-200之间所有质数:");
        for (int i = 101; i <= 200; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    //跳出单层循环 内循环
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("");
        System.out.println("共有" + count + "个素数");
    }
}