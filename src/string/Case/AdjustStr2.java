package string.Case;

public class AdjustStr2 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";

        //循环旋转字符串 并比较
        boolean result = check(strA, strB);

        System.out.println(result);
    }

    public static boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)){
                return true;
            }
        }
        return false;
    }

    public static String rotate(String str){
        //将字符串转换成数组
        char[] arr = str.toCharArray();
        char first = arr[0];

        //将剩下的字符依次往前挪一个位置
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        //把原来 0 索引的字符放到最后一个索引
        arr[arr.length - 1] =first;

        //利用字符数组创建一个字符串对象
        String result = new String(arr);

        return result;
    }

}
