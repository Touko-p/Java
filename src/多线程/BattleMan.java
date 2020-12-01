package 多线程;

import java.util.Random;

public class BattleMan {
    public String name;
    public int hp;
    public BattleMan(String name,int hp){
        this.name=name;
        this.hp=hp;
    }
    public void attack(BattleMan h){
        int damage=100+new Random().nextInt(200);
        try {
            Thread.sleep(1000+new Random().nextInt(2000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        h.hp-=damage;
        if(h.hp<=0){
            System.out.println(name+"击中了"+h.name+",对"+h.name+"造成了"+damage+"点伤害，"+h.name+"剩余生命值为0");
        }else
            System.out.println(name+"击中了"+h.name+",对"+h.name+"造成了"+damage+"点伤害，"+h.name+"剩余"+h.hp+"点生命");
        while (h.isDead()){
            System.out.println("战斗结束，"+name+"获得了胜利");
            System.exit(0);
        }
    }
    public boolean isDead(){
        return 0>=hp?true:false;
    }
}
