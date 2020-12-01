package 集合框架;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class For {
    public static void main(String[]args){
        List<Hero> LH=new ArrayList<>();
        for(int i=0;i<5;i++){
            LH.add(new Hero("Hero"+i));
        }
        System.out.println(LH);
        // 第一种遍历 for循环
        System.out.println("--------for 循环-------");
        for(int i=0;i<LH.size();i++){
            Hero h=LH.get(i);
            System.out.print(h+" ");
        }
        System.out.println();
        //第二种遍历，使用迭代器
        System.out.println("--------使用while的iterator-------");
        Iterator<Hero> it=LH.iterator();
        //从最开始的位置判断"下一个"位置是否有数据
        //如果有就通过next取出来，并且把指针向下移动
        //直到"下一个"位置没有数据
        while(it.hasNext()){
            Hero h = it.next();
            System.out.print(h+" ");
        }
        System.out.println();
        //迭代器的for写法
        System.out.println("--------使用for的iterator-------");
        for (Iterator<Hero> iterator = LH.iterator(); iterator.hasNext();) {
            Hero hero = (Hero) iterator.next();
            System.out.print(hero+" ");
        }
        System.out.println();
        // 第三种，增强型for循环
        System.out.println("--------增强型for循环-------");
        for (Hero h : LH) {
            System.out.print(h+" ");
        }


    }
}
