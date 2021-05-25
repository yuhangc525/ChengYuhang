package com.cheng.debug_;

public class Debug01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += 1;
            System.out.println("i="+i);
            System.out.println("sum="+sum);
        }
    }
}
