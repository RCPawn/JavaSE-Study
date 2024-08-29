package oob.ObjectOriented1;

public class FriendTest {
    public static void main(String[] args) {
        //定义数组 存储朋友的对象
        Friend[] arr = new Friend[4];

        //创建对象
        Friend friend1 = new Friend("蜡笔小新", 18, "男", "上学");
        Friend friend2 = new Friend("懒洋洋", 19, "男", "吃零食");
        Friend friend3 = new Friend("小猪佩奇", 6, "女", "睡觉");
        Friend friend4 = new Friend("小马宝莉", 16, "女", "看星星");

        //把对象添加到数组中
        arr[0] = friend1;
        arr[1] = friend2;
        arr[2] = friend3;
        arr[3] = friend4;

        //计算出四个朋友的平均年龄
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Friend friend = arr[i];
            sum += friend.getAge();
        }

        double avgAge = sum * 1.0 / arr.length;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            Friend friend = arr[i];
            if (friend.getAge() > avgAge) {
                System.out.println(friend.getName() + "  " + friend.getAge() +
                        "  " + friend.getGender() + "  " + friend.getHobby());
                count++;
            }
        }

        System.out.println("以上" + count + "个朋友的年龄大于平均年龄");
    }
}
