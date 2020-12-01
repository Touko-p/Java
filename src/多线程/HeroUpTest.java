package 多线程;

public class HeroUpTest {
    public static void main(String[]args){
        HeroUp hu=new HeroUp();
        hu.name="亚索";
        hu.hp=20;
        for (int i=0;i<5;i++) {
            new Thread() {
                public void run() {
                    while (true) {
                        hu.hurt();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();
        }
        for(int i=0;i<2;i++) {
            new Thread() {
                public void run() {
                    while (true) {
                        hu.recover();
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();
        }
    }
}
