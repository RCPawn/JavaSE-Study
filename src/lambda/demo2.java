package lambda;

public class demo2 {
    public static void main(String[] args) {

        //lambda 表达式能够简化有且仅有一个抽象方法的函数式接口的匿名内部类
       /** method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳~~~");
            }
        });*/

        method(() -> System.out.println("正在游泳~~~"));

    }

    public static void method(Swim s) {
        s.swimming();
    }
}

interface Swim {
    void swimming();
}
