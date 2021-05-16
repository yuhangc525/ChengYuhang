package com.cheng.extend_;

public class Sub extends Base{
    public Sub(){
        System.out.println("sub()...");
    }
    //私有属性和方法不能被直接访问
    public void sayOk(){
        System.out.println(n1+n2+n3);
        test100();
        test200();
        test300();
    }
}
