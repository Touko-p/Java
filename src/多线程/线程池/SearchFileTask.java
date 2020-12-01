package 多线程.线程池;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SearchFileTask implements Runnable{
    private File file;
    private String search;
    public SearchFileTask(File file,String search){
        this.file=file;
        this.search=search;
    }
    @Override
    public void run() {
        String fileconet=readFileConet(file);
        if(fileconet.contains(search)){
            System.out.printf("线程:%s找到了目标字符串%s ,在文件：%s%n ",Thread.currentThread().getName(),search,file);
        }
    }
    public static String readFileConet(File file){
        try (FileReader fr=new FileReader(file)){
            char a[]=new char[(int)file.length()];
            fr.read(a);
            return new String(a);
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
