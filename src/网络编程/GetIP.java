package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP {
    public static void main(String[]args){
        try {
            InetAddress host=InetAddress.getLocalHost();
            String ip=host.getHostAddress();
            System.out.println("本机IP地址："+ip);
        }catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
