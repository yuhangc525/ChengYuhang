package UDP;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/29
 * @describe:
 */

import java.io.IOException;
import java.net.*;

public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        //1.创建一个 DatagramSocket 对象，准备在9999接收数据
        DatagramSocket socket = new DatagramSocket(9999);
        //2.构建一个DataPacket对象，准备接受数据
        //UDP 数据包最大为64KB
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //3.调用接受方法，将通过网络传输的 DatagramPacket 对象
        // 填充到packet对象
        //提示：当有数据包发送到本机的9999端口时，就会接收到数据
        //如果没有数据包发送到本机的9999端口，就会阻塞等待
        System.out.println("接收端，等待接受数据..");
        socket.receive(packet);

        //4.可以把packet进行拆包，去除数据，并显示
        int length = packet.getLength();//实际接收到的数据字节长度
        byte[] data = packet.getData();//接收到数据
        String s = new String(data,0,length);
        System.out.println(s);

        //=======回复信息
        byte[] ans = "好的，明天老地方见".getBytes();
        packet = new DatagramPacket(ans,ans.length, InetAddress.getLocalHost(),9998);
        socket.send(packet);

        //5.关闭资源
        socket.close();
        System.out.println("接收端退出");
    }
}
