package Homework;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/16
 * @describe:
 */

import javax.lang.model.element.VariableElement;
import java.util.Locale;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}
class A extends Thread{
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            System.out.println((int) (Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("A线程已退出");
    }
}
class B extends Thread{
    private A a;
    private Scanner scanner = new Scanner(System.in);
    public B(A a){
        this.a = a;
    }

    @Override
    public void run() {
        //接收到用户的输入
        while (true) {
            System.out.println("请输入你的指令：");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q'){
                //以通知的方式结束另一个线程
                a.setLoop(false);
                break;
            }
        }
    }
}