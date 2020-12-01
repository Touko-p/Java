package 多线程;

public class TestMystack {
    public static void main(String[]args){
        Mystack1 mystack=new Mystack1();
        for(int i=0;i<2;i++){
            Producer pt=new Producer(mystack,"producer"+(i+1));
            new Thread(pt).start();
        }
        for(int i=0;i<3;i++){
            Consumer ct=new Consumer(mystack,"consumer"+(i+1));
            new Thread(ct).start();
        }
    }

}
