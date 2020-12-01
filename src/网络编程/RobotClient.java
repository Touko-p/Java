package 网络编程;


import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class RobotClient {
    public static void main(String[]args){
        try {
            //连接到本机的8888端口
            Socket s = new Socket("127.0.0.1",8899);
            System.out.println(s);
            OutputStream os=s.getOutputStream();
            DataOutputStream dos=new DataOutputStream(os);
            InputStream is=s.getInputStream();
            DataInputStream dis=new DataInputStream(is);
            while (true) {
                String str = new Scanner(System.in).next();
                dos.writeUTF(str);
                String str1=dis.readUTF();
                System.out.println("来自服务端的消息："+str1);
            }
        }catch (UnknownHostException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
