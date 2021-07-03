package Homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/3
 * @describe:
 */

public class Homework03 {
    public static void main(String[] args) {
        String str = "Han Hun Ping";
        printName(str);

    }
    public static void printName(String str){
        if(str == null){
            System.out.println("str 不能为空");
            return;
        }
        String[] names = str.split(" ");
        if(names.length != 3){
            System.out.println("输入的字符串不对");
            return;
        }
        String format = String.format("%s,%s .%c",names[2],names[0],names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
