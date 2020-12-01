package 多线程;


public class Producer implements Runnable{
    private Mystack1 stack;
    private String name;
    public Producer(Mystack1 stack, String name){
        this.stack=stack;
        this.name=name;
    }
    @Override
    public void run() {
        while (true){
            String str=randomChar();
            stack.push(str);
            System.out.println(this.name+"压入:"+str);
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public String randomChar(){
        int min='A';
        int max='Z'+1;
        char mark=(char)(Math.random()*(max-min)+min);
        return Character.toString(mark);
    }
}
