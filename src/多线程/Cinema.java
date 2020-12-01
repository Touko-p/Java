package 多线程;

public class Cinema extends Thread {
    static int tickers=1;
    Object obj="a";
    public Cinema(String name){
        super(name);
    }
    public void run(){
        while (tickers<101){
            synchronized (obj){
                if(tickers<101){
                    System.out.println(getName()+"卖出了第"+tickers+"张票");
                    tickers++;
                }else {
                    System.out.println("票卖完了");
                }
            }
            try {
                Thread.sleep(5);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[]args){
        Cinema s1=new Cinema("窗口一");
        Cinema s2=new Cinema("窗口二");
        Cinema s3=new Cinema("窗口三");
        s1.start();
        s2.start();
        s3.start();
    }
}
