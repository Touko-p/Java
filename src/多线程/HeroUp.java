package 多线程;

public class HeroUp {
    public String name;
    public int hp;
    public synchronized void recover(){
        if(hp==1000){
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
            hp+=1;
            System.out.println(name+"回了一点血，hp为"+hp);
    }
    public synchronized void hurt(){
        hp--;
        System.out.println(name+"失去了一点血,hp为"+hp);
        this.notify();
    }
}
