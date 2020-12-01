package 文件;
//寻找文件中最大最小文件
import java.io.File;

public class File1 {
    public static void main(String[]args){
        File f=new File("C:/Windows" );
        File[] k=f.listFiles();
        if(k==null){
            System.out.println("该盘无文件");
            return;
        }
        File MaxFile=null;
        File MinFile=null;
        long MaxSize=0;
        long MinSize=Long.MAX_VALUE;
        for(File file:k){
           /*if(file.isDirectory()){
                continue;
            }*/
            if(file.length()>MaxSize){
                MaxSize=file.length();
                MaxFile=file;
            }
            if(file.length()!=0&&file.length()<MinSize){
                MinSize=file.length();
                MinFile=file;
            }
        }
        System.out.println("最大文件："+MaxFile+",最大文件长度："+MaxSize);
        System.out.println("最小文件："+MinFile+",最小文件长度："+MinSize);
    }
}
