package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TestSocket {
    public static void main(String[]args)throws IOException,InterruptedException{
        InetAddress host=InetAddress.getLocalHost();
        String ip=host.getHostAddress();
        String ipRange=ip.substring(0,ip.lastIndexOf('.'));
        System.out.println("本机ip地址是："+ip);
        System.out.println("网段是："+ipRange);
        List<String> list= Collections.synchronizedList(new ArrayList<>());
        ThreadPoolExecutor threadPool=new ThreadPoolExecutor(10,15,60, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
        AtomicInteger number=new AtomicInteger();
        for (int i=0;i<255;i++){
            String testIp=ipRange+"."+(i+1);
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    boolean reachable=isReachable(testIp);
                    if(reachable)
                        list.add(testIp);
                    synchronized (number){
                        System.out.println("已经完成:" + number.incrementAndGet() + " 个 ip 测试");
                    }
                }
            });
        }
        threadPool.shutdown();
        if(threadPool.awaitTermination(1,TimeUnit.HOURS)){
            System.out.println("如下ip地址可以连接");
            for (String theip : list) {
                System.out.println(theip);
            }
            System.out.println("总共有:" + list.size() + " 个地址");
        }
    }
    private static boolean isReachable(String ip){
        try {
            boolean reachable=false;
            Process p=Runtime.getRuntime().exec("ping -n 1 " + ip);
            BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
            String str=null;
            StringBuilder sb=new StringBuilder();
            while ((str=br.readLine())!=null){
                if(str.length()!=0){
                    sb.append(str+"\r\n");
                }
            }
            reachable=sb.toString().contains("TTL");
            br.close();
            return reachable;
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }
}
