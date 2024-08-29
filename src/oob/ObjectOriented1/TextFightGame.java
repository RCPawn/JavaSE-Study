package oob.ObjectOriented1;

import java.util.Random;

public class TextFightGame {
    private String name;
    private int blood;
    private char gender;
    private String face;//随机

    //面貌描述
    String[] boyFaces = {"风流倜傥", "一塌糊涂", "五官端正", "相貌平平", "面目狰狞"};
    String[] girlFaces = {"闭月羞花", "亭亭玉立", "残不忍睹", "美轮美奂", "身材娇好"};

    //攻击描述
    String[] attacks = {
            "%s使出了一招【乌鸦坐飞机】，转到对方的身后，一单向%s背心的灵台穴拍去。",
            "%s便出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，摔向%s双腿。",
            "%s运气于掌，一瞬间早心变得血红，一式【龙卷风摧毁停车场】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮栏】，结结实实的捶向%s",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //受伤描述
    String[] injures = {
            "结果%s退了半步，毫发无伤",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像源软泥般塌了下去"
    };

    public TextFightGame() {
    }

    public TextFightGame(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();

        //长相随机 区别男女
        if (gender == '男') {
            int index = r.nextInt(boyFaces.length);
            this.face = boyFaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlFaces.length);
            this.face = girlFaces[index];
        } else {
            this.face = "面目狰狞";
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(TextFightGame role) {
        Random r = new Random();
        int index = r.nextInt(attacks.length);
        String KungFu = attacks[index];

        //输出一个攻击的效果
        System.out.printf(KungFu, this.getName(), role.getName());
        System.out.println();

        //计算造成的伤害
        int hurt = r.nextInt(30) + 1;

        //剩余血量
        int remainBlood = role.getBlood() - hurt;
        //对剩余血量进行验证
        remainBlood = remainBlood < 0 ? 0 : remainBlood;

        //修改一下挨揍人的血量
        role.setBlood(remainBlood);

        //受伤描述
        if (remainBlood > 90) {
            System.out.printf(injures[0], role.getName());
        } else if (remainBlood > 80 && remainBlood <= 90) {
            System.out.printf(injures[1], role.getName());
        } else if (remainBlood > 70 && remainBlood <= 80) {
            System.out.printf(injures[2], role.getName());
        } else if (remainBlood > 60 && remainBlood <= 70) {
            System.out.printf(injures[3], role.getName());
        } else if (remainBlood > 40 && remainBlood <= 60) {
            System.out.printf(injures[4], role.getName());
        } else if (remainBlood > 20 && remainBlood <= 40) {
            System.out.printf(injures[5], role.getName());
        } else if (remainBlood > 10 && remainBlood <= 20) {
            System.out.printf(injures[6], role.getName());
        } else {
            System.out.printf(injures[7], role.getName());
        }
        System.out.println();

    }

    public void showRoleInfo() {
        System.out.println("姓名:" + getName());
        System.out.println("血量:" + getBlood());
        System.out.println("性别:" + getGender());
        System.out.println("长相:" + getFace());
    }

}