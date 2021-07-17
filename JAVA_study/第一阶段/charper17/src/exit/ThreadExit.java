package exit;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/15
 * @describe:
 */
@SuppressWarnings({"all"})
public class ThreadExit {
    public static void main(String[] args) {
        T t = new T();
        t.start();
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.setLoop(false);
    }
}
class T extends Thread{
    int count = 0;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
    private boolean loop = true;
    @Override
    public void run() {
        while (loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T 运行中..."+(++count));
        }
    }
}
