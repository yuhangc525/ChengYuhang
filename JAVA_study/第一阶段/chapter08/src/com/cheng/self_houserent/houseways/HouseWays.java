package com.cheng.self_houserent.houseways;

import com.cheng.self_houserent.house.House;

//逻辑层，储存所有方法
public class HouseWays {
    private int n;
    House[] houses;
    //创建构造器，接受房屋列表最大值
    public HouseWays(int n) {
        this.n = n;
        houses = new House[n];
    }
    //创建新增房屋方法
    public boolean add(House house,int num){
        houses[num-1] = house;
        return true;
    }
    //创建根据ID返回特定房屋的方法
    public House findByID(int id){
        return houses[id - 1];
    }
    //创建删除房屋数组的方法
    public boolean del(int ID){
        int index = ID - 1;
        for (int i = index; i < n-1; i++) {
            houses[i] = houses[i+1];
            if(houses[i] != null) {
                houses[i].setId(i + 1);//重新更改房源编号
            }
        }
        houses[n-1] = null;
        return true;
    }
    //返回房屋数组
    public House[] getHouses(){
        return houses;
    }
}
