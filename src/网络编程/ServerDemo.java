package 网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerDemo {
    private ServerSocket server;
    public ServerDemo(int port) throws IOException {
        server=new ServerSocket(port);
    }
    public void start(){
        while (true){
            try {
                Socket socket=server.accept();
                System.out.println(socket+"已连接");
                new Thread(new Chat(socket)).start();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    class Chat implements Runnable{
        private Socket socket;
        public Chat(Socket socket){
            this.socket=socket;
        }
        @Override
        public void run() {
            try {
                BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
                PrintWriter pw=new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"),true);
                String str=null;
                while ((str=br.readLine())!=null){
                    pw.println("客户端说："+str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                System.out.println("一个客户端掉线了");
                try {
                    if(socket!=null)
                        socket.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[]args){
        try {
            ServerDemo serverDemo=new ServerDemo(9999);
            serverDemo.start();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
