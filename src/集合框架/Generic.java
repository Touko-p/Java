package 集合框架;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[]args){
        //对于不使用泛型的容器，可以往里面放英雄，也可以往里面放物品
        List heros=new ArrayList();
        heros.add(new Hero("亚索"));
        //本来用于存放英雄的容器，现在也可以存放物品了
        heros.add(new Item("无用大棒"));
        //对象转型会出现问题
        Hero h1=  (Hero) heros.get(0);
        //尤其是在容器里放的对象太多的时候，就记不清楚哪个位置放的是哪种类型的对象了
        Item h2=  (Item) heros.get(1);
        //引入泛型Generic
        //声明容器的时候，就指定了这种容器，只能放Hero，放其他的就会出错
        List<Hero> LH=new ArrayList<Hero>();
        LH.add(new Hero("盖伦"));
        //如果不是Hero类型，根本就放不进去
        //LH.add(new Item("无尽"));
        //除此之外，还能存放Hero的子类
        LH.add(new APHero());
        //并且在取出数据的时候，不需要再进行转型了，因为里面肯定是放的Hero或者其子类
        Hero h = LH.get(0);
        System.out.println(h);


        List<Father> LF=new ArrayList<Father>();
        LF.add(new Hero("亚索"));
        LF.add(new Item("电刀"));
    }
}
