package string;

public class SensitiveWordsReplace {
    public static void main(String[] args) {
        //定义一个敏感词库
        String[] arr = {"TMD","CNM","SB","MLGB"};

        //获取说的话
        String talk = "SB,CNM";

        //循环得到数组中的每个敏感词 依次替换
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }

        System.out.println(talk);
    }
}
