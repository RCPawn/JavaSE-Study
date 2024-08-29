package search;

public class Blocks {
    public static void main(String[] args) {
        //块内无序，块间有序
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        //1.创建三个块的对象
        block b1 = new block(21,0,5);
        block b2 = new block(45,6,11);
        block b3 = new block(73,12,17);

        //2.创建数组blockArr存放每一个块对象的信息
        block[] blocks = {b1,b2,b3};

        //3.定义一个变量用来记录要查找的元素
        int num = 32;

        //4.调用方法，传递索引表，数组，要查找的元素
        int index = getIndex(blocks,arr,num);

        //5.打印
        System.out.println(index);
    }

    //利用分块查找的原理，查询 num 的索引
    private static int getIndex(block[] blocks, int[] arr, int num) {
        int indexBlock = findIndexBlock(blocks, num);
        if (indexBlock == -1){
            return -1;
        }
        int startIndex = blocks[indexBlock].getStartIndex();
        int endIndex = blocks[indexBlock].getEndIndex();
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == num)
                return i;
        }
        return -1;
    }

    //确定 num 在哪一块中
    public static int findIndexBlock(block[] blocks, int num){
        for (int i = 0; i < blocks.length; i++) {
            if (num <= blocks[i].getMax())
                return i;
        }
        return -1;
    }
}

class block{
    private int max;
    private int startIndex;
    private int endIndex;

    public block() {
    }

    public block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    @Override
    public String toString() {
        return "block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}