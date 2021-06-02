package com.cheng.self_houserent.tools;

import com.cheng.self_houserent.house.House;

import java.util.Scanner;

//工具类，简化业务层代码
public class Tools {
    Scanner in = new Scanner(System.in);

    //建立接受选择的函数，必须输入1~6中的一个
    public char getChoice(){
        boolean loop = true;
        char choice;
        do{
            choice = in.next().charAt(0);
            if(choice != '1' && choice != '2'&& choice != '3'
                    && choice != '4'&& choice != '5'&& choice != '6'){
                System.out.print("输入错误，请重新输入：");
                continue;
            }
            loop = false;
        }while(loop);
        return choice;
    }
    public String getString(){
        String string = in.next();
        return string;

    }

    public int getInt(){
        int dou = in.nextInt();
        return dou;
    }

    public House getMessage(int num){
        System.out.print("姓名：");
        String name = getString();
        System.out.print("电话：");
        String phone = getString();
        System.out.print("地址：");
        String address = getString();
        System.out.print("月租：");
        int rent = getInt();
        System.out.print("状态（已出租/未出租）：");
        String state = getString();
        House house = new House(num,name,phone,address,rent,state);
        return house;
    }
    public int getID(int num){
        do{
            int ID = in.nextInt();
            if(ID <= 0 || ID > num){
                System.out.println("ID输入错误，请重新输入：");
                continue;
            }
            return ID;
    }while (true);
    }

    public boolean ensure(){
        System.out.print("执行后不可更改，请再次确认（y/n）");
        char choi;
        do{
            choi = in.next().charAt(0);
            if(choi == 'y'){
                return true;
            }else if(choi == 'n'){
                return false;
            }else{
                System.out.println("请输入正确字符（y/n）：");
            }

        }while(true);
    }
}
