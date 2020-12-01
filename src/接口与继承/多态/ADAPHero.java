package 接口与继承.多态;

public class ADAPHero extends Hero implements Mortal{
    @Override
    public void die() {
        System.out.println(name+",ADAP死了");
    }
}
