package 文件;
//以字节流的形式向文件写入数据
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream1 {
    public static void main(String[]args){
        File f=new File("D:/.input/ace.txt");
        try {
            byte a[]={4,6};
            FileOutputStream fos=new FileOutputStream(f);
            fos.write(a);
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
