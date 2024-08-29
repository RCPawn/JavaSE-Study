package arr.ArrAndMethod.Case;

import java.util.Random;

public class redPacket {
    public static boolean contains(int[] arr,int price){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==price){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Random rd=new Random();
        int[] arr={1,2,3,4,5};
        int[] newArr=new int[arr.length];

        for (int i = 0; i < arr.length; ) {
            int randomIndex=rd.nextInt(arr.length);
            int price=arr[randomIndex];
            if(!contains(newArr,price)){
                newArr[i]=price;
                //满足条件 i 递增
                i++;
            }
        }

        for (int j = 0; j < newArr.length; j++) {
            System.out.println(newArr[j]);
        }

    }
}