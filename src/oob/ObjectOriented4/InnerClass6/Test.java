package oob.ObjectOriented4.InnerClass6;

public class Test {
    public static void main(String[] args) {
        // 匿名内部类 格式
        /*new 类名或接口名(){
            重写方法;
        };*/
        new Swim(){
            @Override
          public void swim(){
              System.out.println("重写了 Swim 方法");
          }
        };

        new Animal(){
            @Override
            public void eat() {
                System.out.println("重写了 eat 方法");
            }
        };

        // 如果 Dog 对象只用一次 这样就太麻烦了
        /**Dog d = new Dog();
        method(d);*/

        // 使用场景
        // Animal 的子类对象
        method(new Animal(){
            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        }
        );
    }

    public static void method(Animal a){
        a.eat(); // 编译看左边 运行看右边
    }
}
