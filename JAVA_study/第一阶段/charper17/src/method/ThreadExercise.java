package method;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/16
 * @describe:
 */

public class ThreadExercise {
    public static void main(String[] args) {
        T3 t3 = new T3();
        Thread thread = new Thread(t3);
        thread.setName("老大哥");

        for (int i = 0; i < 10; i++) {
            System.out.println("hi"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 4){
                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
class T3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}