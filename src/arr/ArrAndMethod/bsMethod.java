package arr.ArrAndMethod;

public class bsMethod {

    public static void main(String[] args) {
        int l1=7,l2=5,w1=3,w2=4;
        int squ1 = happyDay(l1,w1);
        int squ2 = happyDay(l2,w2);
        compare(squ1,squ2);
    }

    public static void compare(int squ1,int squ2) {
        if (squ1 > squ2) {
            System.out.println("squ1更大");
        }else{
            System.out.println("squ2更大");
        }
    }

    public static int happyDay(int l, int w) {
        int squ=l*w;
        return squ;
    }
}
