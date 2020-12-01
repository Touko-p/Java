package 文件;
//分解文件2
import java.io.*;

public class disPhoto1 {
    public static void main(String[]args){
        //fj("D:/Photo/2.jpg");
        hb("D:/Photo/photo1","D:/Photo/Pt1/2.jpg");
    }
    public static void fj(String srcfile){
        File f=new File(srcfile);
        FileOutputStream fos=null;
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        try (FileInputStream fis=new FileInputStream(f);
             BufferedInputStream bis=new BufferedInputStream(fis)){
            int a=-1;int b=0;
            while ((a=bis.read())!=-1){
                if(b%(1024*100)==0){
                    fos=new FileOutputStream("D:Photo/photo1/part"+(b/1024/100+1));
                }
                fos.write(a);
                b++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void hb(String srcfile,String destfile){
        File f=new File(srcfile);
        File f1=new File(destfile);
        FileInputStream fis=null;
        BufferedInputStream bis=new BufferedInputStream(fis);
        try (FileOutputStream fos=new FileOutputStream(f1);
             BufferedOutputStream bos=new BufferedOutputStream(fos)){
             int len=f.listFiles().length;
             for(int i=1;i<len+1;i++){
                 fis=new FileInputStream(f+"/part"+i);
                 int b=-1;
                 while ((b=fis.read())!=-1){
                     fos.write(b);
                 }
             }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
