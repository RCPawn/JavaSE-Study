package oob.ObjectOriented1;

public class TextFightTest {
    public static void main(String[] args) {
        //创建第一个角色
        TextFightGame r1 = new TextFightGame("杰瑞", 100,'男');
        //创建第二个角色
        TextFightGame r2 = new TextFightGame("汤姆", 100,'女');

        r1.showRoleInfo();
        System.out.println();
        r2.showRoleInfo();
        System.out.println();

        //开始格斗 回合制;
        while (true) {
            //r1开始攻击r2
            r1.attack(r2);
            //判断r2剩余血量
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "K.O了" + r2.getName());
                break;
            }

            //r2攻击r1
            r2.attack(r1);
            //判断r1血量
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "K.O了" + r1.getName());
                break;
            }
        }

    }
}
