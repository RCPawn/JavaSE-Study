package search;

public class Basic {
    public static void main(String[] args) {
        int[] arr = {131,127,157,355,23,7,79};
        int number = 127;
        System.out.println(basicSearch(arr, number));
    }

    public static boolean basicSearch(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }
}