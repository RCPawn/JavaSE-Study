package api.Math;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(7));
        System.out.println(isPrimeNumber(15));
        System.out.println(isPrimeNumber(997));
    }

    public static boolean isPrimeNumber(int num){
        if (num <= 0){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}