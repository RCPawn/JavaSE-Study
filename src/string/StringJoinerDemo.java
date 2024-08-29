package string;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        int[] arr = {1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }

        String result = sj.toString();

        System.out.println(result);
    }
}