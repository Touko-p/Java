package 网络编程;

import java.io.IOException;
import java.net.Socket;

public class TClient {
    public static void main(String[]args){
        try {
            Socket s=new Socket("127.0.0.1", 9876);
            new SendThread(s).start();
            new RecieveThread(s).start();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
