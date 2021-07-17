package threaduse;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/15
 * @describe:通过实现接口Runnable来开发线程
 */

import javax.swing.text.AbstractDocument;

public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
    }
}
class Dog implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("小狗汪汪叫"+(++count)+"线程名="+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count >= 10){
                break;
            }
        }
    }
}