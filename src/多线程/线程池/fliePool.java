package 多线程.线程池;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class fliePool {
    public static void search(File file,String search){
        if(file.isFile()){
            if(file.getName().toLowerCase().endsWith(".java")){
                ThreadPoolExecutor tpe=new ThreadPoolExecutor(10,15,60, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
                tpe.execute(new Runnable() {
                    @Override
                    public void run() {
                        String fileContent=fileContent(file);
                        if(fileContent.equals(search)){
                            System.out.printf("线程%s找到了目标字符串%s在文件%s中",Thread.currentThread().getName(),search,file);
                        }
                    }
                });
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
    public static String fileContent(File file){
        try (FileReader fr=new FileReader(file)){
            char all[]=new char[(int)file.length()];
            fr.read(all);
            return new String(all);
        }catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[]args){
        File f=new File("D:");
        search(f,"Cat");
    }
}
