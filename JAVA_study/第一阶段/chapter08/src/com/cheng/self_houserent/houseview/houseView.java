package com.cheng.self_houserent.houseview;

import com.cheng.self_houserent.house.House;
import com.cheng.self_houserent.houseways.HouseWays;
import com.cheng.self_houserent.tools.Tools;

//业务层，通过调用方法层实现所有业务
public class houseView {
    private char choice;
    boolean loop = true;
    private int n; //记录数组的最大个数
    private int num = 0; //记录数组中房屋的数量
    Tools tools = new Tools();
    HouseWays houseways;
    public houseView(int n) {
        this.n = n;
        houseways = new HouseWays(n);
    }
    //创建修改房屋的方法
    public void changeHouse(){
        System.out.println("------修改房屋------");
        System.out.print("请输入待修改房屋编号：");
        int ID = tools.getID(num);
        System.out.println("当前房屋信息如下：");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        System.out.println(houseways.findByID(ID));
        System.out.println("请重新输入信息：");
        House house = tools.getMessage(num);
        if (houseways.add(house,ID)){
            System.out.println("修改成功");
        }

    }
    //创建删除房屋的方法
    public void delHouse(){
        System.out.println("------删除房屋------");
        System.out.print("请输入待删除房屋编号：");
        int ID  = tools.getID(num);
        if(!tools.ensure()){
            return;
        }
        if(houseways.del(ID)){
            System.out.println("删除成功");
        }
    }
//    创建查找房屋的方法
    public void findHouse(){
        System.out.println("------查找房屋------");
        System.out.print("请输入ID：");
        int ID = tools.getID(num);
        System.out.println("查找房屋信息：");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        System.out.println(houseways.findByID(ID));

    }
    //创建新增房屋的方法
    public void addHouse(){
        if(++num == n+1){
            System.out.println("数组已满，无法增加");
            return;
        }
        System.out.println("------添加房屋------");
        House house = tools.getMessage(num);
        if (houseways.add(house,num)){
            System.out.println("添加成功");
        }
    }

    //创建显示房屋列表的方法
    public void showHouse(){
        System.out.println("------房屋列表------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses = houseways.getHouses();
        for (int i = 0; i < n; i++) {
            if(houses[i] != null){
                System.out.println(houses[i]);
            }
        }
    }
    public void Menu(){
        do{
            System.out.println("------房屋出租系统------");
            System.out.println("\t\t1 新增房源");
            System.out.println("\t\t2 查找房屋");
            System.out.println("\t\t3 删除房屋");
            System.out.println("\t\t4 修改房屋信息");
            System.out.println("\t\t5 房屋列表");
            System.out.println("\t\t6 退   出");
            System.out.print("请选择（1-6）：");
            choice = tools.getChoice();
            switch (choice){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    changeHouse();
                    break;
                case '5':
                    showHouse();
                    break;
                case '6':
                    if(tools.ensure()) {
                        loop = false;
                    }
                    break;
        }
        }while(loop);
    }

}
