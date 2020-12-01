package 多线程;


public class Consumer implements Runnable{
    private Mystack1 stack;
    private String name;
    public Consumer(Mystack1 stack, String name){
        this.stack=stack;
        this.name=name;
    }
    @Override
    public void run() {
        while (true){
            Object o=stack.pull();
            System.out.println(this.name+"弹出："+o);
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
