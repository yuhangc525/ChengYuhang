package threaduse;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/15
 * @describe:在主线程启动两个子线程
 */

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}
class T1 implements Runnable{
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello, world!"+(++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count>=30){
                break;
            }
        }
    }
}
class T2 implements Runnable{
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("Hi"+(++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count>=20){
                break;
            }
        }
    }
}