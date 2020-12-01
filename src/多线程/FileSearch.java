package 多线程;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileSearch extends Thread{
    private String search;
    private File file;
    public FileSearch(File file,String search) {
        this.file=file;
        this.search = search;
    }
    @Override
    public void run() {
        String fileConent=readFileConent(file);
        if(fileConent.contains(search)){
            System.out.println("找到了目标字符串"+search+"在文件"+file+"中");
        }
    }
    public static String readFileConent(File file1){
        try (FileReader fr=new FileReader(file1)){
            char all[]=new char[(int)file1.length()];
            fr.read(all);
            return new String(all);
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    public static void search(File file,String search){
        if(file.isFile()){
            if(file.getName().toLowerCase().endsWith(".java")){
                new FileSearch(file,search).start();
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
