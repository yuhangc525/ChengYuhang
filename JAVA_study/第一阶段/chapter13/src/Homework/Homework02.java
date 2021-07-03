package Homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/3
 * @describe:
 */

public class Homework02 {
    public static void main(String[] args) {
        String name = "jack";
        String pwd = "123456";
        String email = "jack@sohu.com";
        try {
            userRegister(name,pwd,email);
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userRegister(String name, String pwd, String email) {
        int userLength = name.length();

        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("用户名");
        }
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码的长度为6，要求全是数字");
        }
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)){
            throw new RuntimeException("邮箱格式不对");
        }

    }

    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }

}
