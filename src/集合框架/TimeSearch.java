package 集合框架;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TimeSearch {
    public static void main(String[]args){
        ArrayList<Hero> hero=new ArrayList<>();
        HashMap<Integer,Hero> hm=new HashMap<>();
        for(int i=0;i<3000000;i++){
            int a=(int)(Math.random()*10000+1000);
            Hero h=new Hero("Hero-"+a);
            hero.add(h);
            hm.put(i,h);
        }
        long start=System.currentTimeMillis();
        ArrayList h1=new ArrayList();
        for(Hero h:hero){
            if(h.name.equals("Hero-5555")){
                h1.add(h);
            }
        }
        long end=System.currentTimeMillis();
        System.out.printf("通过for循环查找到了%d个重复英雄，耗时%d毫秒%n",h1.size(),end-start);
        long start1=System.currentTimeMillis();
        ArrayList h2=new ArrayList();
        Iterator iterator=hm.keySet().iterator();
        while (iterator.hasNext()){
            if(hm.get(iterator.next()).toString().equals("Hero-5555")){
                h2.add(hm.get(iterator.next()));
            }
        }
        long end1=System.currentTimeMillis();
        System.out.printf("通过遍历HashMap找到了%d个重复英雄，耗时%d毫秒",h2.size(),end1-start1 );
    }
}
