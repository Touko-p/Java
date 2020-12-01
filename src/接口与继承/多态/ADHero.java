package 接口与继承.多态;

public class ADHero extends Hero implements Mortal {
    @Override
    public void die() {
        System.out.println(name+",AD死了");
    }
}
