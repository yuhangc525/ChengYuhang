package com.single_;

public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);
        //两个对象指向同一个
        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);
    }
}

class Cat{
    private String name;
    public static int n1 = 999;
    //只有用户使用时，才会调用
    private static Cat cat;

    private Cat(String name) {
        System.out.println("构造器");
        this.name = name;
    }
    //只会产生一个对象
    public static  Cat getInstance(){
        if(cat==null){
            cat = new Cat("小可爱");
        }
        return cat;
    }
}