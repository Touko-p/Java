package 文件;
//以字节流的形式读取文件内容
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Stream {
    public static void main(String[]args){
        File f=new File("D:/.input/ace.txt");
        try {
            FileInputStream fis=new FileInputStream(f);
            byte all[]=new byte[(int)f.length()];
            fis.read(all);
            for(byte i:all){
                System.out.println(i);
            }
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
