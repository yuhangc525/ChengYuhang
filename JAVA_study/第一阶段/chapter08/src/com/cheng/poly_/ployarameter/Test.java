package com.cheng.poly_.ployarameter;


public class Test {
    public static void main(String[] args) {
        Work tom = new Work("tom", 2500);
        Manage milan = new Manage("milan", 5000, 20000);
        Test test = new Test();
        test.showAnnual(tom);
        test.showAnnual(milan);

        test.testWork(tom);
        test.testWork(milan);
    }
    public void showAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e){
        if(e instanceof Work){
            ((Work)e) .work();//向下转型
        } else if (e instanceof Manage){
            ((Manage)e).manage();
        }else{
            System.out.println("不作处理");
        }
    }
}
