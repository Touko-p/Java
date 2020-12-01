package 异常;

public class Hero {
    String name;
    float hp;
    class EnemyHeroIsDeadException extends Exception{
        public EnemyHeroIsDeadException(){

        }
        public EnemyHeroIsDeadException(String msg){
            super(msg);
        }
    }
    public String toString(){
        return name;
    }
    public void attackHero(Hero h)throws EnemyHeroIsDeadException{
        if(hp==0){
            throw new EnemyHeroIsDeadException(h.name + " 已经挂了,不需要施放技能" );
        }
    }
    public static void main(String[]args){
        Hero h=new Hero();
        h.name="亚索";
        h.hp=0;
        try {
            h.attackHero(h);
        }
        catch (EnemyHeroIsDeadException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
