package 多线程;


import java.util.LinkedList;

public class Mystack1 implements Stack {
    LinkedList<Object> list=new LinkedList<>();
    @Override
    public synchronized void push(Object o) {
        while (list.size()>=200){
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("当前栈内数据"+list);
        list.addLast(o);
        this.notify();

    }

    @Override
    public synchronized Object pull() {
        while (list.isEmpty()){
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("当前栈内数据："+list);
        this.notify();
        return  list.removeLast();
    }

    @Override
    public  Object peek() {
        return  list.getLast();
    }
}
