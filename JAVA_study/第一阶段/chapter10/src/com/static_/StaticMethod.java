package com.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu jack = new Stu("jack");
        jack.payFee(100);
        Stu tom = new Stu("tom");
        tom.payFee(200);
        Stu.payFee(200);

        Stu.showFee();

    }
}

class Stu{
    private String name;
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    public static void payFee(double fee){
        Stu.fee += fee;
    }
    public static void showFee(){
        System.out.println("总学费："+Stu.fee);
    }
}
