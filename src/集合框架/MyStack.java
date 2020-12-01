package 集合框架;

import java.util.LinkedList;

public class MyStack implements Stack {
    static LinkedList<Hero> hero=new LinkedList<>();
    @Override
    //把英雄推入到最后位置
    public synchronized void push(Hero h) {
        hero.addLast(h);
    }

    @Override
    //把最后一个英雄取出来
    public synchronized Hero pull() {
        return hero.removeLast();
    }
    //查看最后一个英雄
    @Override
    public Hero peek() {
        return hero.getLast();
    }
    public static void main(String[]args){
        MyStack ms=new MyStack();
        System.out.println("当前栈内元素："+hero);
        for(int i=0;i<5;i++){
            ms.push(new Hero("英雄"+i));
            System.out.println("压入："+ms.peek());
            System.out.println("当前栈内元素："+hero);
        }
        for(int i=0;i<5;i++){
            System.out.println("弹出"+ms.peek());
            ms.pull();
            System.out.println("当前栈内元素："+hero);
        }
    }
}
