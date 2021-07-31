package HomeWork;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/27
 * @describe:
 */

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Homework01Client {
    public static void main(String[] args) {
        Socket socket = null;
        Scanner scanner = new Scanner(System.in);
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String input = "";
        try {
            socket = new Socket(InetAddress.getLocalHost(),8888);
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            //写入信息
            input = scanner.next();
            bufferedWriter.write(input);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            //接受信息
            String line = bufferedReader.readLine();
            System.out.println(line);
            socket.shutdownInput();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
