package Date_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/2
 * @describe:
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();//获取当前系统时间
        System.out.println(d1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = simpleDateFormat.format(d1);
        System.out.println(format);
        Date d2 = new Date(998486484);
        System.out.println("d2="+d2);
        //1.可以把一个格式化的string转成对应的Date
        //2.得到Date 在输出时仍然按照国外形式，如果希望指定格式输出，需要进行转换
        String s = "2021年07月02日 04:32:30 星期五";
        Date parse = simpleDateFormat.parse(s);
        System.out.println(parse);

    }
}
