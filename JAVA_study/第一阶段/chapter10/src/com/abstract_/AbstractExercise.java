package com.abstract_;

public class AbstractExercise {
    public static void main(String[] args) {
        Manager cheng = new Manager("cheng", "10000", 100000, 100);
        CommonEmployee david = new CommonEmployee("david", "99", 100.12);
        cheng.work();
        david.work();
    }

}
