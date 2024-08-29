package test1;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend("jerry", 18, 1.67);
        GirlFriend gf2 = new GirlFriend("sunny", 19, 1.65);
        GirlFriend gf3 = new GirlFriend("funny", 19, 1.60);

        GirlFriend[] arr = {gf1, gf2, gf3};
        /**Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                if (temp > 0){
                    return 1;
                } else if (temp < 0){
                    return -1;
                } else {
                    return 0;
                }
            }
        });*/

        Arrays.sort(arr, (o1, o2) -> {
            double temp = o1.getAge() - o2.getAge();
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
            if (temp > 0){
                return 1;
            } else if (temp < 0){
                return -1;
            } else {
                return 0;
            }
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
