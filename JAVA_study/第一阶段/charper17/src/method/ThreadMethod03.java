package method;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/16
 * @describe:
 */

public class ThreadMethod03 {
    public static void main(String[] args) {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        //如果我们希望当main线程结束后，子线程自动结束
        //只需要将子线程设置为守护线程
        for (int i = 1; i <= 10; i++) {
            System.out.println("You are working!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyDaemonThread extends Thread{
    @Override
    public void run() {
        for (;;){//无限循环
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("They are chatting happily");
        }
    }
}