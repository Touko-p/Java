package 接口与继承.多态;

public class TesrHero {
    public static void main(String[]args){
        Hero h=new Hero();
        h.name="德玛";
        APHero h1=new APHero();
        h1.name="邪恶小法师";
        ADHero h2=new ADHero();
        h2.name="戏命师";
        ADAPHero h3=new ADAPHero();
        h3.name="亚索";
        h.kill(h1);
        h.kill(h2);
        h.kill(h3);
    }
}
