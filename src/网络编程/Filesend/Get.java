package 网络编程.Filesend;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Get {
    public static void main(String[]args){
        try {
            ServerSocket ss=new ServerSocket(8888);
            Socket s=ss.accept();
            System.out.println(s+"已连接");
            InputStream is=s.getInputStream();
            FileOutputStream fos=new FileOutputStream(new File("D:/Server/p2/5.txt"));
            int a=0;
            byte b[]=new byte[1024];
            while ((a=is.read(b))!=-1){
                fos.write(b);
            }
            is.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
