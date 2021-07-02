package StringBuffer_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/21
 * @describe:
 */

public class StringAndSringBufer {
    public static void main(String[] args) {
        String str = "hello Tom!";
        //string -> stringbuffer
        //方法1,使用构造器
        StringBuffer stringBuffer = new StringBuffer(str);
        //方式2 使用append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);

        //stringbuffer -> string
        StringBuffer buffer = new StringBuffer("程宇航");
        //方式1 tostring方法
        String s = buffer.toString();
        //方式2 使用构造器
        String s1 = new String(buffer);
    }
}
