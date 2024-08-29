package arr.ArrAndMethod.Case;

import java.util.Random;

//生成验证码 长度为5 要求 四位随机大小写字母 一位数字
public class Captcha1 {
    public static void main(String[] args) {
        // 1 将大写字母与小写字母都放到数组当中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //97对应a 所有小写字母
            if (i <= 25) {
                //添加小写字母
                chs[i] = (char) (97 + i);
            } else {
                //添加大写字母 当i = 26时开始添加大写字母
                chs[i] = (char) (65 + i - 26);
            }

        }
        //定义一个字符串 记录最后的结果
        String str = "";
        // 2 随机四次 随机抽取数组中的索引
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            str += chs[randomIndex];
        }
        //随机一个数字 将其与 str 拼接
        int num=r.nextInt(10);
        str+=num;

        String result = disorder(str);
        System.out.println(result);
    }

    public static String disorder(String str){

        //转换成字符数组
        char[] arr = str.toCharArray();

        Random r = new Random();
        int index = r.nextInt(arr.length);

        for (int i = 0; i < arr.length; i++) {
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        String result = new String(arr);

        return result;
    }
}