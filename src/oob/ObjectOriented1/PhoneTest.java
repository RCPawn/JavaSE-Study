package oob.ObjectOriented1;

public class PhoneTest {
    public static void main(String[] args) {
        //创建一个数组
        Phone[] arr = new Phone[3];

        //创建对象
        Phone p1 = new Phone("小米", 1999.0, "white");
        Phone p2 = new Phone("华为", 5999.0, "black");
        Phone p3 = new Phone("苹果", 8999.0, "black");

        //将手机对象添加到对象当中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //获取每部手机的平均价格
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }

        //求平均值
        double avg = sum * 1.0 / arr.length;

        System.out.println(avg);

//        BigDecimal

    }
}
