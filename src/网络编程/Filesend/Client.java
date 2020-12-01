package 网络编程.Filesend;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void Send(String srcFile){
        File f=new File(srcFile);
        try (FileReader fr=new FileReader(f)){
            Socket s=new Socket("127.0.0.1",8888);
            OutputStream os=s.getOutputStream();
            DataOutputStream dos=new DataOutputStream(os);
            char cs[]=new char[(int)f.length()];
            fr.read(cs);
            String str=new String(cs);
            dos.writeUTF(str);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        String str=new Scanner(System.in).next();
        Send(str);
    }
}
