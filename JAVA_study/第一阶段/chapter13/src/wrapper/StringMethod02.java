package wrapper;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/21
 * @describe:
 */

import java.util.Locale;

public class StringMethod02 {
    public static void main(String[] args) {
        String s = "Hello";
        //1.toUpperCase全部转为大写
        System.out.println(s.toUpperCase());
        //2.toLowerCase全部转为小写
        System.out.println(s.toLowerCase());
        //3.concat拼接字符串
        String s2 = " everybody!";
        System.out.println(s.concat(s2));
        //4.replace替换字符串中的字符,不会直接改变字符串
        System.out.println(s.replace('e','!'));
        //4.split以特定字符分隔字符串,返回一个数组
        //对字符串进行分隔时，如果有特殊字符，需要加入转义符 \
        String poem = "锄禾日当午，汗滴禾下土，谁知盘中餐，粒粒皆辛苦";
        String[] split = poem.split("，");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        //6.toCharArray转换成字符数组
        String s3 = "Happy";
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        //7.compareTo 比较两个字符串的大小，前者大，返回正数
        //后者大，返回负数，相等返回0
        //如如果长度相同，每个字符也相同，返回0
        //如果长度相同或者不相同，可以区分大小，就返回差值
        //如果前面的部分都相同，返回长度差
        System.out.println(s.compareTo(s2));
        //8.format格式化字符串
        //（1）%s,%d为占位符
        //（2）这些占位符由后边变量来替换
        //（3）%s由后面字符串来替换
        //（4）%d整数替换
        //（5）%.2f使用小数来替换，替换后，保留小数点后两位，并四舍五入
//        %c char类型填充
        String info = String.format("你是%s",s);
        System.out.println(info);
    }
}
