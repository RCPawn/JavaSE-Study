package arr.ArrAndMethod.Case;

public class searchmax {

    public static void main(String[] args) {
        int height1 = 170;
        int height2 = 170;
        int height3 = 180;
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;
        System.out.println(max);
    }
}

