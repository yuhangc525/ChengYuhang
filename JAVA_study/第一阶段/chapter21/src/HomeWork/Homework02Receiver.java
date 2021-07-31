package HomeWork;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/29
 * @describe:
 */

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Homework02Receiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);
        System.out.println("9999监听中");
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        //对接受数据拆包
        int length = packet.getLength();
        buf = packet.getData();
        String ans = "";
        String s = new String(buf,0,length);
        //发送数据
        System.out.println(s);
        if (s.equals("四大名著？")){
            ans = "我知道";
        }else {
            ans = "你说啥呢";
        }
        buf = ans.getBytes();
        packet = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(),9998);
        socket.send(packet);


        //关闭资源
        socket.close();
    }
}
