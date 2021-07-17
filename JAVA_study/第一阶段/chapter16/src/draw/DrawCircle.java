package draw;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/12
 * @describe:
 */

import javax.swing.*;
import java.awt.*;
@SuppressWarnings({"all"})
public class DrawCircle extends Frame{//对应一个窗口
    //定义一个面板
    private Mypanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle(){
        mp = new Mypanel();
        this.add(mp);
        //设置窗口的大小
        this.setSize(400,300);
        this.setVisible(true);
    }
}
class Mypanel extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //画圆
//        g.drawOval(10,10,100,100);
        //画直线
        //g.drawLine(10,10,200,200);
        //画出矩形边框,确定对角点
        //g.drawRect(10,10,100,100);
        //填充矩形
        //设置画笔颜色
        g.setColor(Color.blue);
        //g.fillRect(10,10,100,100);
    }
}