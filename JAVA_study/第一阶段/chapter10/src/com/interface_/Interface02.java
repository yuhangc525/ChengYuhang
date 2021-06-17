package com.interface_;

public class Interface02 {
    public static void main(String[] args) {
        DBmysql mysql = new DBmysql();
        t(mysql);

    }
    public static void t(DBinterface db){
        db.connect();
        db.close();
    }
}
