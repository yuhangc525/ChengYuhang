package wrapper;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/20
 * @describe:
 */

public class Wrapper_String {
    public static void main(String[] args) {
        //方式1
        Integer i = 100;
        String str = i + "";
        //方式2
        String str2 = i.toString();
        //方式3
        String str3 = String.valueOf(i);
        //string->包装类（Integer）
        String str4 = "123456";
        Integer i2 = Integer.parseInt(str4);//使用自动装箱
        Integer i3 = new Integer(str4);//构造器
        System.out.println(i3);
    }
}
