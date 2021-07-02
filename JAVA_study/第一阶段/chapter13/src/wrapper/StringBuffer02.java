/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/21
 * @describe:stringbuffer构造器
 */

public class StringBuffer02 {
    public static void main(String[] args) {
        //1.创建一个大小为16的char【】，用于存放字符内容
        StringBuffer stringBuffer1 = new StringBuffer();
        //2.通过构造器指定char【】大小
        StringBuffer stringBuffer2 = new StringBuffer(100);
        //3.通过给一个str
        StringBuffer hello = new StringBuffer("hello");

    }
}
