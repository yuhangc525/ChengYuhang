package socket;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/25
 * @describe:使用字符流
 */

import sun.security.krb5.internal.ASRep;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

@SuppressWarnings({"all"})
public class SocketTCP03Server {
    public static void main(String[] args) {
        try {
            //思路
            //1.在本机的9999端口监听，等待连接
            //   细节：要求本机没有其他服务在监听9999
            ServerSocket serverSocket = new ServerSocket(9999);
            System.out.println("服务端，在9999端口监听，等待连接..");
            //2.当没有客户端连接9999端口时，程序会堵塞，等待连接
            //  如果有客户端连接，则会返回Socket对象，程序继续
            Socket socket = serverSocket.accept();

            System.out.println("socket="+socket.getClass());
            //3.通过socket.getInputStream() 读取
            InputStream inputStream = socket.getInputStream();
            //io读取,使用字符流
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
            //结束本次接受输入，结束标记
            socket.shutdownInput();
            //获取socket相关联的输出流,使用字符流的方式回复信息
            OutputStream outputStream = socket.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
            bw.write("hello ,client 字符流");
            bw.newLine();
            bw.flush();//刷新才能写入
            bw.close();
            br.close();
            socket.close();
            serverSocket.close();
            //  客户端写入到数据通道的数据，显示
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
