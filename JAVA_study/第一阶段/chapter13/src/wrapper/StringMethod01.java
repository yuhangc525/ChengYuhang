package wrapper;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/21
 * @describe:string常用方法
 */

public class StringMethod01 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "Hello";
        //1.equal比较内容是否相等，考虑大小写
        System.out.println(s1.equals(s2));
        //2.equalsIgnoreCase比较内容是否相等，忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));
        //3.length获取字符的个数，字符串的长度
        System.out.println(s1.length());
        //4.indexof获取字符（或字符串）在字符串第一次出现的索引，不存在返回-1
        String s3 = "@123@124";
        System.out.println(s3.indexOf('@'));
        //5.lastindexof获取字符（或字符串）在字符串最后一次出现的索引，不存在返回-1
        System.out.println(s3.lastIndexOf('@'));
        //6.substring截取指定范围的子串
        //从索引2截取后面所有内容
        System.out.println(s3.substring(2));
        //从索引1开始，截取到索引为2的字符
        System.out.println(s3.substring(1,3));
    }
}
