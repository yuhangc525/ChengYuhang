package com.honserent.view;

import com.honserent.domin.House;
import com.honserent.service.HouseService;
import com.honserent.utiers.Utility;


public class HouseView {
    private boolean loop = true;
    private  char key;
    private HouseService houseService = new HouseService(10);

    //
    public void update(){
        System.out.println("---------修改房屋信息------------");
        System.out.println("请输入待修改房屋编号（-1表示退出）");
        int updateId = Utility.readInt();
        if(updateId == -1){
            System.out.println("放弃修改房屋信息");
            return;
        }
        House house = houseService.findById(updateId);
        if(house == null ){
            System.out.println("ID不存在");
        }else{
            System.out.println("修改成功");
        }
    }
    //
    public void findHouse(){
        System.out.println("-------------查找房屋信息-----------");
        System.out.println("请输入要查找的id：");
        int findid = Utility.readInt();
        House house = houseService.findById(findid);
        if(house != null){
            System.out.println(house);
        }else{
            System.out.println("查找房屋信息不存在");
        }

    }
    //退出确认
    public void exit(){
        char c = Utility.readConfirmSelection();
        if(c == 'Y'){
            loop = false;
        }
    }
    //删除房屋编号
    public void delHouse(){
        System.out.println("------------修改房屋信息------------");
        System.out.println("请输入待删除的编号（-1退出）：");
        int delId  = Utility.readInt();
        if(delId == -1){
            System.out.println("放弃删除房屋信息。");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if(choice == 'Y'){
            if(houseService.del(delId)){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
        }else{
            System.out.println("放弃删除");
        }
    }
    //addHouse()方法，接受输入，调用add方法
    public void addHouse(){
        System.out.println("------------新增房源------------");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);
        House house = new House(0,name,phone,address,rent,state);
        if(houseService.add(house)){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }
    //listHouse 输出所有房屋信息
    public void listHouse(){
        System.out.println("------------房屋列表------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if(houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
    }

    public void mainMenu(){
        do{
            System.out.println("\n==============房屋出租系统=============");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房屋");
            System.out.println("\t\t\t3 删除房屋信息");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 房屋列表");
            System.out.println("\t\t\t6 退出");
            System.out.print("请输入你的选择（1-6）:");
            key = Utility.readMenuSelection();
            switch (key){
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
                    update();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
            }
        }while(loop);
    }
}
