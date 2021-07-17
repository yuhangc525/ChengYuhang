package ticket;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/15
 * @describe:上锁
 */


@SuppressWarnings({"all"})
public class SellTicket {
    public static void main(String[] args) {
        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();

        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();

    }
}
class SellTicket01 extends Thread{
    private static int ticketnum = 100;//让多个线程共享 ticknum
    private static boolean loop = true;
    public /*synchronized static*/ void sell(){
        synchronized (SellTicket.class){
        if (ticketnum <= 0) {
                System.out.println("售票结束。。。");
                loop = false;
                return;
            }
            //休眠50毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + " 售出一张票" +
                    "剩余票数=" + (--ticketnum));
        }}
    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}