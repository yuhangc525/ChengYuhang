package socket;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/25
 * @describe:使用字符流
 */

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

@SuppressWarnings({"all"})
public class SocketTCP03Client {
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
            //3.通过输出流，写入到数据到数据通道，使用字符流
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
            bw.write("hello,server 字符流");
            bw.newLine();//插入一个换行符，表示写入的内容结束，注意：要求对方使用readLine()！！！
            bw.flush();//如果使用的字符流，需要手动刷新，否则数据不会写入数据通道
            bw.close();
            //结束本次输入，结束标记，不然无法输出
            socket.shutdownOutput();
            //4.获取与socket相关联的输入流
            InputStream inputStream = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
            //5.关闭所有对象
            socket.close();
            System.out.println("客户端退出");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
