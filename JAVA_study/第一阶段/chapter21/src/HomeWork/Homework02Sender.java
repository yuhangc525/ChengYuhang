package HomeWork;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/29
 * @describe:
 */

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Homework02Sender {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9998);
        System.out.println("请输入你的问题：");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();
        byte[] ques = in.getBytes();
        DatagramPacket packet = new DatagramPacket(ques,ques.length, InetAddress.getLocalHost(),9999);
        socket.send(packet);
        //接受新数据
        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf,buf.length);
        socket.receive(packet);
        int  length = packet.getLength();
        buf = packet.getData();
        System.out.println(new String(buf,0,length));
    }
}
