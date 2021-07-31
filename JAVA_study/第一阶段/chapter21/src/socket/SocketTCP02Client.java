package socket;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/25
 * @describe:
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
@SuppressWarnings({"all"})
public class SocketTCP02Client {
    public static void main(String[] args) {
        try {
            //思路
            //1.连接服务端（IP，端口）
            //解读，连接本机的9999端口，如果连接成功，返回socket对象
            Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
            System.out.println("客户端 socket返回="+socket.getClass());
            //2.连接后，生成socket，通过
            //得到和socket对象关联的输出流对象
            OutputStream outputStream = socket.getOutputStream();
            //3.通过输出流，写入到数据到数据通道
            outputStream.write("hello,sever".getBytes());
            //结束本次输入，结束标记，不然无法输出
            socket.shutdownOutput();
            //4.获取与socket相关联的输入流
            InputStream inputStream = socket.getInputStream();
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = inputStream.read(buf)) != -1){
                System.out.println(new String(buf,0,readLen));
            }
            //5.关闭所有对象
            outputStream.close();
            socket.close();
            inputStream.close();
            System.out.println("客户端退出");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
