package com.cheng.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//完成零钱通的各个功能的类
//将各个功能设置成一个方法
public class SmallChargeOOP {
    Scanner scanner = new Scanner(System.in);
    boolean loop = true;
    String in;//获得用户选项
    String details = "----------零钱通明细----------";
    //收益入账参数初始化
    Date date = null;//获得日期
    double balance = 0;//余额
    double shouru;//收入钱数
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以格式化日期
    //消费金额参数初始化
    Scanner note = new Scanner(System.in);//获取消费说明
    double zhichu;
    String shuoming="";

    public void mainMenu(){
        do {
            System.out.println("\n========选择零钱通========");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退出");
            System.out.println("=====================");
            in = scanner.next();
            //字符串拼接，完成零钱通明细功能

            switch (in) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                default:
                    System.out.println("输入错误，请重新输入");
            }
        } while (loop);
    }
    public void detail(){
        System.out.println(details);
    }
    public void income(){
        System.out.print("收益入账金额：");
        shouru = scanner.nextDouble();
        //找出不正确的金额
        if(shouru<=0){
            System.out.println("收益错误");
            return;
        }
        balance += shouru;//更新余额
        date = new Date();//获得当前日期
        details += "\n收益入账"+"\t+"+shouru+"\t"+sdf.format(date)+"\t"+balance;
        return;
    }
    public void pay(){
        System.out.print("消费金额：");
        zhichu = scanner.nextDouble();
        if(zhichu<0||zhichu>balance){
            System.out.println("消费金额应在0~"+balance);
            return;
        }
        System.out.print("消费说明：");
        shuoming = note.next();
        balance -= zhichu;
        date = new Date();
        details += "\n"+shuoming+"\t-"+zhichu+"\t"+sdf.format(date)+"\t"+ balance;
        return;
    }
    public void exit(){
        String choice = "";
        while(true){//强制输入y/n，否则一直提示
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if("y".equals(choice)||"n".equals(choice)){
                break;
            }
        }
        if("y".equals(choice)){
            loop = false;
            System.out.println("退出");
            return;
        }else if("n".equals(choice)){
            return;
        }
    }
}
