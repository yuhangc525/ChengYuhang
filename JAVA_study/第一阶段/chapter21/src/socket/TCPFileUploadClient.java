package socket;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/26
 * @describe:客户端向服务端传输图片，并接受“收到”信息，客户端
 */

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TCPFileUploadClient {
    public static void main(String[] args) {
        Socket socket = null;
        String filePath = "F:\\软件系统培训\\资料\\分享资料\\tk.png";
        FileInputStream fis = null;
        OutputStream opt = null;
        InputStream ips = null;
        BufferedReader bufferedReader = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(), 8888);
            System.out.println("客服端 socket = "+ socket.getClass());
            fis = new FileInputStream(filePath);
            opt = socket.getOutputStream();
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fis.read(buf)) != -1){
                opt.write(buf);
            }
            socket.shutdownOutput();
            System.out.println("图片传输结束");
            //接受返回的信息
            ips = socket.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(ips));
            String line = "";
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            socket.shutdownInput();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭所有
            try {
                socket.close();
                fis.close();
                opt.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
