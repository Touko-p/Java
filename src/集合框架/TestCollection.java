package 集合框架;

import Test.Char;

import java.util.ArrayList;

public class TestCollection {
    public static void main(String[]args){
        ArrayList list=new ArrayList();
        // 把5个对象加入到ArrayList中
        for (int i=0;i<5;i++){
            list.add(new Hero("Hero"+i));
        }
        System.out.println(list);
        // add 在指定位置增加对象
        Hero f=new Hero("亚索");
        list.add(3,f);
        System.out.println(list);
        //contains  判断一个对象是否在容器中
        // 判断标准： 是否是同一个对象，而不是name是否相同
        System.out.println(list.contains(new Hero("Hero1")));
        System.out.println(list.contains(f));
        //get 获取指定位置的对象
        System.out.println("所处位置是3的英雄名字是"+list.get(3));
        //indexOf 用于判断一个对象在ArrayList中所处的位置
        System.out.println("亚索在ArrayList中所处的位置"+list.indexOf(f));
        System.out.println("名字是Hero1所处的位置"+list.indexOf(new Hero("Hero1")));
        //remove 用于把对象从ArrayList中删除
        list.remove(0);
        list.remove(f);
        System.out.println(list);
        //set 用于替换指定位置的元素
        list.set(0,new Hero("盖伦"));
        list.set(1,f);
        System.out.println(list);
        //size 用于获取ArrayList的大小
        System.out.println(list.size());
        //toArray 可以把一个ArrayList对象转换为数组
        Hero h[]= (Hero[]) list.toArray(new Hero[]{});
        System.out.println(h);
        for(Hero a:h) {
            if(a.name.equals("亚索")) {
                System.out.println("找到了name是hero 1的对象");
            }
        }

        for(int i = 0;i<list.size();i++) {
            if(list.get(i).toString().equals("Hero3")) {
                System.out.println("找到了name是hero 1的对象");
            }
        }
        System.out.println(list.get(3));
        //addAll 把另一个容器所有对象都加进来
        ArrayList al=new ArrayList();
        for(int i=0;i<3;i++){
            al.add(new Hero("Monster"+i));
        }
        System.out.println(list);
        System.out.println(al);
        list.addAll(al);
        System.out.println(list);
        //clear 清空一个ArrayList
        list.clear();
        System.out.println(list);
    }
}
