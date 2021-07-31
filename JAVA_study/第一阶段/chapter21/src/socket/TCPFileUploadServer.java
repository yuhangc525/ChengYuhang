package socket;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/26
 * @describe:使用tcp传输图片，并返回“收到”信息，服务端
            使用循环输出图片数据
 */

import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPFileUploadServer {
    public static void main(String[] args){
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream ipt = null;
        OutputStream ops = null;
        FileOutputStream fos = null;
        String filePath = "src\\copy.png";
        BufferedWriter bufferedWriter = null;
        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("服务端 在8888端口监听中...");
            socket = serverSocket.accept();
            System.out.println("socket="+socket.getClass());
            ipt = socket.getInputStream();
            fos = new FileOutputStream(filePath);
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = ipt.read(buf))!=-1){
                fos.write(buf);
            }
            System.out.println("接受完毕");
            socket.shutdownInput();
            //返回“收到”信息
            ops = socket.getOutputStream();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(ops));
            bufferedWriter.write("已收到图片");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
                ipt.close();
                fos.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
