package syn;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/16
 * @describe:死锁
 */

public class Deadlock_ {
    public static void main(String[] args) {
        DeadLockDemo T = new DeadLockDemo(true);
        DeadLockDemo F = new DeadLockDemo(false);
        T.setName("A线程");
        F.setName("B线程");
        T.start();
        F.start();
    }
}
class DeadLockDemo extends Thread{
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;
    public DeadLockDemo(boolean flag){
        this.flag = flag;
    }
    @Override
    public void run(){

        //业务逻辑分析
        //1.如果flag为T，线程就会先得到o1对象锁，然后尝试获取o2对象锁；
        //2.如果线程A得不到o2对象锁，就会blocked
        //3.如果flag为F，线程就会先得到o2对象锁，然后尝试获取o1对象锁；
        //4.如果线程A得不到o1对象锁，就会blocked
        if(flag){
            synchronized (o1){//对象互斥锁，下面就是同步代码
                System.out.println(Thread.currentThread().getName()+"进入1");
                synchronized (o2){//这里获得li对象的监视权
                    System.out.println(Thread.currentThread().getName()+"进入2");
                }
            }
        }else {
            synchronized (o2){
                System.out.println(Thread.currentThread().getName()+"进入3");
                synchronized (o1){//这里获得li对象的监视权
                    System.out.println(Thread.currentThread().getName()+"进入4");
                }
            }
        }
    }
}