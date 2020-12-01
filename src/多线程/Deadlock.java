package 多线程;

public class Deadlock {
    public static void main(String[]args){
        Object a=new Object();
        Object b=new Object();
        Object c=new Object();
        new Thread(){
            public void run(){
                synchronized (a){
                    System.out.println("已占有a");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("a试图占有b");
                    System.out.println("a等待中");
                    synchronized (b){
                        System.out.println("不知道在干啥");
                    }
                }
            }
        }.start();
        new Thread(){
            public void run(){
                synchronized (b){
                    System.out.println("已占有b");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("b试图占有c");
                    System.out.println("b等待中");
                    synchronized (c){
                        System.out.println("不知道在干啥");
                    }
                }
            }
        }.start();
        new Thread(){
            public void run(){
                synchronized (c){
                    System.out.println("已占有c");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("c试图占有a");
                    System.out.println("c等待中");
                    synchronized (a){
                        System.out.println("不知道在干啥");
                    }
                }
            }
        }.start();
    }
}
