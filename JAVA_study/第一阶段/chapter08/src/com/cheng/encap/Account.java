package com.cheng.encap;

public class Account{
    private String name;
    private int last;
    private String password;

    //建立构造器
    public Account() {
    }

    public Account(String name, int last, String password) {
//        this.name = name;
//        this.last = last;
//        this.password = password;
        setLast(last);
        setName(name);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        if(len>=2&&len<=4) {
            this.name = name;
        }else{
            System.out.println("名字位数不对");
            this.name = "None";
        }
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        if(last>20) {
            this.last = last;
        }else{
            System.out.println("余额必须大于20");
            this.last = 21;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        int len = password.length();
        if(len==6) {
            this.password = password;
        }else{
            System.out.println("密码必须为6位");
            password = "000000";
        }
    }

    public void info(){
        System.out.println("name="+name+" balance="+last+" password="+password);
    }
}

