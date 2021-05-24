package com.cheng.poly_.ployarameter;

public class Manage extends Employee{
    private double bonus;

    public Manage(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage(){

        System.out.println("manager "+getName() +" is managing");
    }

    @Override
    public double getAnnual() {

        return super.getAnnual()+this.bonus;
    }
}
