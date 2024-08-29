package oob.ObjectOriented4.InnerClass6;

public class Test2 {
    public static void main(String[] args) {
        Swim s = new Swim() {

            @Override
            public void swim() {
                System.out.println("重写之后游泳方法");
            }
        };

        s.swim(); // 编译看左边 运行看右边

        new Swim() {

            @Override
            public void swim() {
                System.out.println("重写之后游泳方法");
            }
        }.swim();
    }
}
