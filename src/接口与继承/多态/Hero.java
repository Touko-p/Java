package 接口与继承.多态;

public class Hero {
    String name;
    public void kill(Mortal m){
        System.out.print(name+"击杀了");
        m.die();
    }
}
