package 文件;

import java.io.*;

public class CopyPhoto {
    public static void main(String[]args){
        File f1=new File("D:/Server/p1/img.bmp");
        File f2=new File("D:/Server/p2/a.bmp");
        try (BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f1));BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(f2))){
            int a=0;
            while ((a=bis.read())!=-1){
                bos.write(a);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
