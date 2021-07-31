package HomeWork;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/27
 * @describe:
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Homework01Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("8888监听中....");
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            //接受信息
            String line = "";
            String answer = "";
            line = bufferedReader.readLine();
            System.out.println(line);
            //根据内容回复信息
            if ("name".equals(line)){
                answer = "程宇航";
            }else if ("hobby".equals(line)){
                answer = "编写java";
            }else {
                answer = "你说的啥？";
            }
            bufferedWriter.write(answer);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                serverSocket.close();
                bufferedReader.close();
                bufferedWriter.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
