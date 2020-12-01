package 文件;

import java.io.File;

public class fileSearch {
    static long minSize=Integer.MAX_VALUE;
    static long maxSize=0;
    static File minFile=null;
    static File maxFile=null;
    public static void findFile(File f){
        File[] files=f.listFiles();
        if(f.exists()){
            if(null==files){
                return;
            }
        }
        for(File file:files){
            if(file.isDirectory()){
                if(null==file)
                    return;
                findFile(file);
            }
            if(file.length()>maxSize){
                maxSize=file.length();
                minFile=file;
            }
            if(file.length()!=0&&file.length()<minSize){
                minSize=file.length();
                minFile=file;
            }
        }
    }
    public static void main(String[]args){
        File f=new File("C:/Windows");
        findFile(f);
        System.out.println("最大文件："+maxFile+",最大文件长度："+maxSize);
        System.out.println("最小文件："+minFile+",最小文件长度："+minSize);
    }
}
