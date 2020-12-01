package 文件;
//当文件不存在，以字节流的形式向文件写入数据
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream2 {
    public static void main(String[]args){
        File f=new File("D:/iou/ace.txt");
        try{
            byte a[]={88,99};
            f.getParentFile().mkdirs();
            FileOutputStream fos=new FileOutputStream(f);
            fos.write(a);
            fos.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
