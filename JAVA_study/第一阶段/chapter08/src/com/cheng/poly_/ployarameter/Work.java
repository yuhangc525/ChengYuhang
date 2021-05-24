package com.cheng.poly_.ployarameter;

public class Work extends Employee{
    public Work(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("Worker "+getName()+" is working!");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
