package method;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/16
 * @describe:yield,join方法
 */

public class ThreadMethod02 {
    public static void main(String[] args) {
        T2 t2 = new T2();
        t2.start();

        for (int i = 0; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("吃包子"+i);
            if (i == 5){
                System.out.println("让子线程先运行");
                Thread.yield();//礼让，不一定成功
                    //t2.join();//join 线程插队
                System.out.println("子线程已经吃完");
            }
        }
    }
}
class T2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);//休眠1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("JoinThread----"+i);
        }
    }
}