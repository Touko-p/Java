package 网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[]args){
        try {
            //服务端打开端口8888
            ServerSocket ss=new ServerSocket(8887);
            //在8888端口上监听，看是否有连接请求过来
            System.out.println("监听在端口号:8888");
            Socket s =  ss.accept();
            System.out.println("有连接过来" + s);
            InputStream is=s.getInputStream();
            DataInputStream dis=new DataInputStream(is);
            OutputStream os=s.getOutputStream();
            DataOutputStream dos=new DataOutputStream(os);
            while (true) {
                String str = dis.readUTF();
                System.out.println("来自客户端的消息："+str);
                String str1=new Scanner(System.in).next();
                dos.writeUTF(str1);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
