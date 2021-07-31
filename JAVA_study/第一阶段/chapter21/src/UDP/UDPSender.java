package UDP;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/29
 * @describe:
 */

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class UDPSender {
    public static void main(String[] args) throws IOException {
        //1.创建对象，准备在9998接受数据
        DatagramSocket socket = new DatagramSocket(9998);
        //2.将需要发送的数据封装到 DatagramSocket
        byte[] data = "hello，明天吃火锅~".getBytes();
        //说明：data为字节数组
        DatagramPacket packet = new DatagramPacket(data, data.length,InetAddress.getLocalHost(), 9999);
        socket.send(packet);

        //========接受信息
        socket.receive(packet);
        int length = packet.getLength();
        byte[] ans = packet.getData();
        String s = new String(ans,0,length);
        System.out.println(s);
        //关闭资源
        socket.close();
        System.out.println("发送端退出");


    }
}
