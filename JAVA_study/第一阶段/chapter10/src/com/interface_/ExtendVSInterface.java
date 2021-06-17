package com.interface_;

public class ExtendVSInterface {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("wukong");
        wukong.climbing();
        wukong.swimming();

    }
}

//接口
interface Fishable{
    void swimming();
}
interface Fly{
    void Flying();
}
class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println("猴子爬树。。。");
    }
}
class LittleMonkey extends Monkey implements Fishable,Fly{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(" 学会了游泳。。。");
    }

    @Override
    public void Flying() {
        System.out.println("学会了飞");
    }
}