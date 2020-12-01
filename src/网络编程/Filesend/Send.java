package 网络编程.Filesend;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Send {
    public static void main(String[]args){
        try {
            Scanner scan=new Scanner(System.in);
            Socket s = new Socket("127.0.0.1",8888);
            String str=scan.next();
            File f=new File(str);
            OutputStream os=s.getOutputStream();
            FileInputStream fis=new FileInputStream(f);
            byte b[]=new byte[(int)f.length()];
            int a=0;
            while ((a=fis.read(b))!=-1){
                os.write(b);
            }
            os.close();
            fis.close();
        }catch (UnknownHostException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
