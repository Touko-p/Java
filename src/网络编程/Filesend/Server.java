package 网络编程.Filesend;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void Recive(String destFile){
        File f=new File(destFile);
        try {
            ServerSocket ss=new ServerSocket(8888);
            Socket s=ss.accept();
            System.out.println(s);
            InputStream is=s.getInputStream();
            DataInputStream dis=new DataInputStream(is);
            String str=dis.readUTF();
            System.out.println(str);
            FileWriter fw=new FileWriter(f);
            fw.write(str);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        String str=new Scanner(System.in).next();
        Recive(str);
    }
}
