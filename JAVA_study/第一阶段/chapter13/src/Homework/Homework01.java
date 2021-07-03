package Homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/3
 * @describe:将字符串指定部分进行反转
 */

public class Homework01 {
    public static void main(String[] args) {
        String str = "abcde";
        try {
            str = reverse(str, 1, 100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("=====");
        System.out.println(str);
    }

    public static String reverse(String str, int start, int end) {
        //将字符串转成字符数组
        //对输入参数做一个验证
        //1.写出正确情况
        //2.然后取反即可
        if (!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("参数异常");
        }
        char[] chars = str.toCharArray();
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        //使用chars重新构建一个string返回即可
        return new String(chars);
    }
}
