package 文件;

import java.io.File;

public class File2 {
    static long minSize=Integer.MAX_VALUE;
    static long maxSize=0;
    static File minFile=null;
    static File maxFile=null;
    public static void findFile(File f){
        if(f.isFile()){
            if(f.length()>maxSize){
                maxSize=f.length();
                maxFile=f;
            }
            if(f.length()<minSize&&f.length()!=0){
                minSize=f.length();
                minFile=f;
            }
        }
        if(f.isDirectory()){
            File[] fs=f.listFiles();
            if(null==fs)
                return;
            for (File file:fs){
                findFile(file);
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
