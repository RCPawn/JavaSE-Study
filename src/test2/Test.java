package test2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<PersianCat> list1 = new ArrayList<>();
        ArrayList<CalicoCat> list2 = new ArrayList<>();
        ArrayList<Teddy> list3 = new ArrayList<>();
        ArrayList<Husky> list4 = new ArrayList<>();

        KeepPet(list1);
        KeepPet(list2);
    }

    //能养猫，不能养狗
    public static void KeepPet(ArrayList<? extends Cat> list){

    }

}
