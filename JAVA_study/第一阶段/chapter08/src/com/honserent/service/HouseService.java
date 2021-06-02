package com.honserent.service;
//业务层
import com.honserent.domin.House;

public class HouseService {
    private House[] houses;
    private int houseNums = 1;//记录当前房屋数量
    private int counter = 1;//用来更新字段的ID编号
    public HouseService(int size){
        houses = new House[size];
        houses[0] = new House(1,"jack","110","渭水校区",1500,"未出租");
    }

    public House[] list(){
        return houses;
    }
    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse){
        if(houseNums  == houses.length){
            System.out.println("数组已满");
            return false;
        }
        houses[houseNums++] = newHouse;
        newHouse.setId(++counter);
        return true;
    }
    //del方法，删除一个房屋信息
    public boolean del(int delId){
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if(delId == houses[i].getId()){
                index = i;//使用index记录删除的下标
            }
        }
        if(index == -1){
            return  false;
        }
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;
        return true;

    }
    public House findById(int findId){
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
}
