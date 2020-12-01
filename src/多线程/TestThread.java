package 多线程;

public class TestThread {

    public static void main(String[] args) {

        Hero gareen = new Hero("提莫",10*1000,1);
        Hero teemo = new Hero("德玛",100*100,1);
        Hero bh = new Hero("亚索",100*100,1);
        Hero leesin = new Hero("盲僧",100*100,1);
        /*//继承Thread类创建多线程
        KillThread killThread1 = new KillThread(gareen,teemo);
        killThread1.start();
        KillThread killThread2 = new KillThread(bh,leesin);
        killThread2.start();
        //实现Runnable接口创建多线程
        Battle battle1=new Battle(gareen,teemo);
        Battle battle2=new Battle(bh,leesin);
        new Thread(battle1).start();
        new Thread(battle2).start();*/
        //匿名类创建多线程
        Thread t1= new Thread(){
            public void run(){
                //匿名类中用到外部的局部变量teemo，必须把teemo声明为final
                //但是在JDK7以后，就不是必须加final的了
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }
            }
        };



        //代码执行到这里，一直是main线程在运行
        /*try {
            //t1线程加入到main线程中来，只有t1线程运行结束，才会继续往下走
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/

        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    bh.attackHero(leesin);
                }
            }
        };
        //会观察到盖伦把提莫杀掉后，才运行t2线程
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();



    }

}
