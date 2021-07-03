package Homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/3
 * @describe:
 */

public class Homework04 {
    public static void main(String[] args) {
        String str = "di|;fbu54BU54";
        count(str);
    }
    public static void count(String str){
        if(str == null){
            System.out.println("不能为null");
            return;
        }
        int strLen = str.length();
        int numCount = 0;
        int lowerCount = 0;
        int upperCount = 0;
        int otherCount = 0;
        for (int i = 0; i < strLen; i++) {
            char temp = str.charAt(i);
            if(temp >= 'a' && temp <= 'z'){
                lowerCount++;
            }else if(temp >= '0' && temp <= '9'){
                numCount++;
            }else if(temp >= 'A' && temp <= 'Z'){
                upperCount++;
            }else {
                otherCount++;
            }
        }
        System.out.println(numCount);
        System.out.println(lowerCount);
        System.out.println(upperCount);
    }
}
