package search;

import java.util.ArrayList;

public class Index {
    public static void main(String[] args) {
        int[] arr = {88, 1, 2, 3, 4, 5, 6, 7, 88, 9};
        int number = 88;
        ArrayList<Integer> index = basicSearch(arr, number);
        for (int i = 0; i < index.size(); i++) {
            if (i == index.size() - 1){
                System.out.print(index.get(i));
            } else {
                System.out.print(index.get(i) + ", ");
            }
        }
    }

    public static ArrayList<Integer> basicSearch(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                list.add(i);
            }
        }
        return list;
    }
}
