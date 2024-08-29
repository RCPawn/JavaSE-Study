package arthmetic.day02;

public class PerfectTime {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int rel = 0;
        int minPrice = prices[0];
        for (int price : prices) {
            rel = Math.max(rel, price - minPrice);
            minPrice = Math.min(price, minPrice);
        }

        System.out.println(rel);
    }
}
