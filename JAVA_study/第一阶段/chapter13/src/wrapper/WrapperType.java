package wrapper;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/20
 * @describe:
 */

public class WrapperType {
    public static void main(String[] args) {
        //手动装箱 int—>Integer
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = integer.valueOf(n1);

        //手动拆箱
        int i = integer.intValue();

        //jdk5之后，就可以自动拆箱和自动装箱
        int n2 = 200;
        Integer integer2 = n2;//底层使用的是valueof(n2)
        int n3 = integer2;//底层使用的是 intvalue()方法

    }

}
