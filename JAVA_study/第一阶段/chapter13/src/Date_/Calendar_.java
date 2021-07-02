package Date_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/2
 * @describe:第二代日期
 */

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        //1.Calendar是一个抽象类，并且构造器是私有的
        //2.可以通过getInstance（）来获取实例
        //3.提供大量的方法和字段提供给程序员
        Calendar c = Calendar.getInstance();
        System.out.println("c="+c);
        //获取日历对象的某个日历字段
        System.out.println("年="+c.get(Calendar.YEAR));
        System.out.println("月="+c.get(Calendar.MONTH)+1);
        System.out.println("日="+c.get(Calendar.DAY_OF_MONTH));
    }
}
