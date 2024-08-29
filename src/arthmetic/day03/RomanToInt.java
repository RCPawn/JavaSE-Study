package arthmetic.day03;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "MCMXCIV";

        int sum = 0, n = s.length();
        for (int i = 0; i < n; i++) {
            int value = getInt(s.charAt(i));
            if(i < n - 1 && value < getInt(s.charAt(i + 1))) {
                sum -= value;
            } else {
                sum += value;
            }
        }

        System.out.println(sum);
    }

    public static int getInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }
}
