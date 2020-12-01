package 网络编程;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {
    private Socket socket;
    public ClientDemo(String host,int port)throws IOException {
        socket=new Socket(host,port);
    }
    public void start(){
        try {
            System.out.println("已连接上服务器");
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
            PrintWriter pw=new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"),true);
            new Thread(){
                public void run(){
                    String str=null;
                    try {
                        while ((str=br.readLine())!=null){
                            System.out.println(str);
                        }
                    }catch (IOException e){
                        e.printStackTrace();
                    }finally {
                        System.out.println("服务器断开连接");
                        if(socket!=null)
                            try {
                                socket.close();
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                    }
                }
            }.start();
            Scanner scan=new Scanner(System.in);
            String str=null;
            while (true){
                str=scan.next();
                pw.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        try {
            ClientDemo clientDemo = new ClientDemo("127.0.0.1",9999);
            clientDemo.start();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
