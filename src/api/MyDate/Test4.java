package api.MyDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //计算活了多少天

        //JDK7
        //1.计算出生年月日的毫秒值
        String birthday = "2004年6月9日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();
        //2.获取当前时间的毫秒值
        long currentTime = System.currentTimeMillis();
        //3.计算间隔了多少天
        long time = currentTime - birthdayTime;
        System.out.println(time / 1000 / 60 / 60 / 24);

        //JDK8
        LocalDate ld1 = LocalDate.of(2004, 6, 9);
        LocalDate ld2 = LocalDate.now();
        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(days);
    }
}
