package com.homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/19
 * @describe:
 */

public class Homework07 {
    public static void main(String[] args) {
        Car2 car2 = new Car2(60);
        car2.getAir().flow();
        Car2 car21 = new Car2(-1);
        car21.getAir().flow();
    }
}
class Car2{
    private double tem;
    class Air{
        public void flow(){
            if(tem>40){
                System.out.println("温度大于40，空调吹冷气");
            }else if(tem<0){
                System.out.println("温度小于0，吹暖气");
            }else{
                System.out.println("温度正常，关闭空调");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }

    public Car2(double tem) {
        this.tem = tem;
    }
}
