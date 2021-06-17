package com.single_;
//单例设计模式
//饿汉式
public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);

    }
}

class GirlFriend{
    private String name;
    private  static GirlFriend gf = new GirlFriend("xiaohong");
    //将构造器私有化
    private GirlFriend(String name){
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }

}