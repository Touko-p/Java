package 网络编程;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TServer {
    public static void main(String[]args){
        try {
            ServerSocket ss=new ServerSocket(9876);
            System.out.println("监听端口在8888");
            Socket s=ss.accept();
            System.out.println(s+"已连接");
            new SendThread(s).start();
            new RecieveThread(s).start();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
