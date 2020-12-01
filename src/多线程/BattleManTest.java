package 多线程;

public class BattleManTest {
    public static void main(String[]args){
        BattleMan bm1=new BattleMan("亚索",2000);
        BattleMan bm2=new BattleMan("德玛",2000);
        System.out.println("战斗开始！");
        new Thread(){
            public void run(){
                System.out.println(bm2.name+"准备进攻！");
              while (!bm1.isDead()){
                  bm2.attack(bm1);
              }
            }
        }.start();
        new Thread(){
            public void run(){
                System.out.println(bm1.name+"准备进攻！");
                while (!bm2.isDead()){
                    bm1.attack(bm2);
                }
            }
        }.start();
    }
}
