package 多线程.线程池;

import java.util.LinkedList;

public class ThreadPool {
    int threadPoolsize;
    LinkedList<Runnable> tasks=new LinkedList<>();
    public ThreadPool(){
        threadPoolsize=10;
        synchronized (tasks){
            for(int i=0;i<threadPoolsize;i++){
                new TaskConsumeThread("任务消费线程"+i).start();
            }
        }
    }
    public void add(Runnable r){
        synchronized (tasks){
            tasks.add(r);
            tasks.notifyAll();
        }
    }
    class TaskConsumeThread extends Thread{
        public TaskConsumeThread(String name){
            super(name);
        }
        Runnable task;
        public void run(){
            while (true){
                synchronized (tasks){
                    while (tasks.isEmpty()){
                        try {
                            tasks.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    task=tasks.removeLast();
                    tasks.notifyAll();
                }
                task.run();
            }
        }
    }

}
