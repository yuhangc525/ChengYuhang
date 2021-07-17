package method;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/16
 * @describe:线程常用方法第一组
 */

public class ThreadMethod01 {
    public static void main(String[] args) {
        T t = new T();
        t.setName("老韩");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        //主线程打印5个hi，然后中断子线程休眠
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hi" + i);

        }
        System.out.println(t.getName()+"的优先级："+t.getPriority());
        System.out.println(Thread.currentThread()+"的优先级："+t.getPriority());
        t.interrupt();//当执行到这里，就会中断t线程的休眠

    }
}

class T extends Thread {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "吃包子..." + (++i));
            }
            try {
                System.out.println("老韩在休息");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被interrupt了");
            }
        }
    }
}