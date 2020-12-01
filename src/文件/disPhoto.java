package 文件;
//分解文件1
import java.io.*;

public class disPhoto {
    public static void main(String[]args){
        //fj("D:/Photo/img.bmp");
        hb("D:/Photo/file","D:/Photo/photo/img_copy.bmp");
    }
    public static void fj(String srcfile){
        File f=new File(srcfile);
        FileOutputStream fos=null;
        try (FileInputStream fis=new FileInputStream(f)){
            int a=-1;int b=0;
            while ((a=fis.read())!=-1){
                if(b%(1024*100)==0){
                    fos=new FileOutputStream("D:Photo/file/part"+(b/1024/100+1));
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
