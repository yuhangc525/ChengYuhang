package threaduse;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/15
 * @describe:
 */

public class Thread01 {
    public static void main(String[] args) {
        //创建一个cat对象，可以当成线程使用
        Cat cat = new Cat();
        cat.start();//启动线程
        //说明，：当main线程启动一个子线程，主线程不会阻塞，会继续执行
        //主线程和子线程是交替进行的
        System.out.println("主线程继续执行："+Thread.currentThread().getName());
        for (int i = 0;i < 60;i++){
            System.out.println("主线程i="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Cat extends Thread{
    int times = 0;
    @Override
    public void run() {
        while (true){
        System.out.println("喵喵，我是小咪咪！"+(++times)+"线程名="+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(times == 80){
            break;
        }
    }}
}
