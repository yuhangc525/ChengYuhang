package Date_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/2
 * @describe:第三代日期时间
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        String format = dtf.format(ldt);
        System.out.println("格式化日期="+format);
        System.out.println("年="+ldt.getYear());
        System.out.println("月="+ldt.getMonth());
        System.out.println("日="+ldt.getDayOfMonth());
        System.out.println("时="+ldt.getHour());
        System.out.println("分="+ldt.getMinute());
        System.out.println("秒="+ldt.getSecond());

        LocalDateTime localDateTime = ldt.plusDays(890);
        //输出890天后 年月日时分秒
        System.out.println(dtf.format(localDateTime));
        //3456分钟前
        LocalDateTime l = ldt.minusMinutes(3456);
        System.out.println(dtf.format(l));
    }
}
