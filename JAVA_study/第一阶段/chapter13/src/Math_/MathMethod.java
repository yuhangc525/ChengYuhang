package Math_;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/22
 * @describe:
 */

public class MathMethod {
    public static void main(String[] args) {
        int abs = Math.abs(-9);
        System.out.println(abs);
        double pow = Math.pow(2,4);
        System.out.println(pow);
        double ceil = Math.ceil(3.9);
        System.out.println(ceil);
        double floor = Math.floor(-4.999);
        System.out.println(floor);
        long round = Math.round(-5.51);
        System.out.println(round);
        double sqrt = Math.sqrt(16);
        System.out.println(sqrt);
        //random求随机数，0<=x<1
        //获取[2,7)的整数
        for (int i = 0; i < 10; i++) {
            int a = (2+(int)(Math.random()*5));
            System.out.println(a);
        }

    }
}
