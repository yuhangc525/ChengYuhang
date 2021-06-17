package com.interface_;

public class DBmysql implements DBinterface{
    @Override
    public void connect() {
        System.out.println("连接sql");
    }

    @Override
    public void close() {
        System.out.println("断开sql连接");
    }
}
