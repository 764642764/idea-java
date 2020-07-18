import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.*;

/**
 * 显示当前月份的日历
 * @version  2020-7-18
 * @author  aliang
 */
public class test718 {
    public static void  main(String[] args)
    {
        LocalDate date=LocalDate.now();
        int month=date.getMonthValue();
        int today=date.getDayOfMonth();

        date = date.minusDays(today-1);  //获得本月第一天的数据
        DayOfWeek weekday=date.getDayOfWeek();
        int value=weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i=1;i<value;i++)
            System.out.print("    ");
        while (date.getMonthValue()==month)
        {
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth()==today)
                System.out.print("*");
            else
                System.out.print(" ");
            date=date.plusDays(1);
            if(date.getDayOfWeek().getValue()==1) System.out.println();
        }
        if(date.getDayOfWeek().getValue()!=1) System.out.println();
    }
}
