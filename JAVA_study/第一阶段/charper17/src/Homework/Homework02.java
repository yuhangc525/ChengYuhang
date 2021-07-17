package Homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/17
 * @describe:
 */

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Homework02 {
    public static void main(String[] args) {
        Money money = new Money();
        Thread a = new Thread(money);
        Thread b = new Thread(money);
        a.setName("张三");
        b.setName("李四");
        a.start();
        b.start();
    }
}
class Money implements Runnable{
    private int money = 10000;
    @Override
    public void run() {

        while (true) {
            synchronized (this) {
                if (money < 1000) {
                    System.out.println("余额不足");
                    break;
                }
                money -= 1000;
                System.out.println(Thread.currentThread().getName() + "取出1000，余额为" + money);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}