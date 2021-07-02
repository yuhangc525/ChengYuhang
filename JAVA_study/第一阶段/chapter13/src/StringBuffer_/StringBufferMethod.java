package StringBuffer_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/22
 * @describe:
 */

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        //增加字符串
        s.append(',');
        s.append("张三丰");
        s.append("zhaomin");
        System.out.println(s);
        //删除
        s.delete(11,14);
        System.out.println(s);
        //修改
        s.replace(9,11,"你是shui");
        System.out.println(s);
        //插入
        s.insert(9,"How are you?");
        System.out.println(s.length());
        System.out.println(s);
    }
}
