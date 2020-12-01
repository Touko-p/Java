package 多线程.线程池;


import java.io.File;

public class TestThreadPool {
    static ThreadPool pool=new ThreadPool();
    public static void search(File file,String search){
        if(file.isFile()){
            if(file.getName().toLowerCase().endsWith(".java")){
                SearchFileTask task=new SearchFileTask(file,search);
                pool.add(task);
            }
        }
        if(file.isDirectory()){
            File file1[]=file.listFiles();
            if(file1==null){
                return;
            }
            for (File file2:file1){
                search(file2,search);
            }
        }
    }
    public static void main(String[]args){
        File file=new File("D:");
        search(file,"Cat");
    }
}
