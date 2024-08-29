package api.MyDate;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        //判断任意一年是闰年还是平年

        // JDK7
        //1.
        Calendar c = Calendar.getInstance();
        c.set(2004, 6,9);
        c.add(Calendar.DAY_OF_MONTH, -1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        // JDK8
        LocalDate ld = LocalDate.of(2004, 6,9);
        LocalDate ld2 = ld.minusDays(1);
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);

        //判断是不是闰年
        boolean leapYear = ld.isLeapYear();
        System.out.println(leapYear);
    }
}