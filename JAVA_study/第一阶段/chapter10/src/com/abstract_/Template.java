package com.abstract_;

abstract public class Template {//抽象类方法
    public abstract void job();
    public void calculateTime(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("执行时间："+(end-start));
    }
}
