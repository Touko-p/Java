package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testping {
    public static void main(String[]args)throws IOException {
        Process p=Runtime.getRuntime().exec("ping " + "100.120.17.140");
        BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream(),"gbk"));
        String str=null;
        StringBuilder sb=new StringBuilder();
        while ((str=br.readLine())!=null){
            if(str.length()!=0){
                sb.append(str+"\r\n");
            }
        }
        System.out.println("本次指令返回的消息是：");
        System.out.println(sb.toString());
    }
}
