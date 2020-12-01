package 多线程;

public class BodongQuan extends Thread{
    public void shoot(){
        while (true){
            for (int i=1;i<4;i++){
                System.out.println("开炮");
                System.out.println("波动拳第"+i+"发");
                if(i==3){
                    try {
                        System.out.println("开始3秒的充能");
                        Thread.sleep(3000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String[]args){
        new BodongQuan().shoot();
    }
}
