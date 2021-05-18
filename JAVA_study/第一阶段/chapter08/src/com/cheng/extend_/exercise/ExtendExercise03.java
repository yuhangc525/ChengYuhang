package com.cheng.extend_.exercise;


class Computer{
    private String cpu;
    private String neicun;
    private String yingpan;

    public Computer() {
    }

    public Computer(String cpu, String neicun, String yingpan) {
        this.cpu = cpu;
        this.neicun = neicun;
        this.yingpan = yingpan;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getNeicun() {
        return neicun;
    }

    public void setNeicun(String neicun) {
        this.neicun = neicun;
    }

    public String getYingpan() {
        return yingpan;
    }

    public void setYingpan(String yingpan) {
        this.yingpan = yingpan;
    }

    public void getDetails(){
        System.out.printf("cpu:%s neicun:%s yingpan:%s\n",cpu,neicun,yingpan);
    }
}

class PC extends Computer{
    private String brand;

    public PC() {
    }

    public PC(String cpu, String neicun, String yingpan, String brand) {
        super(cpu, neicun, yingpan);
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
class Notepad extends Computer{
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

