package 文件;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fwriter {
    public static void main(String[]args){
        File f=new File("D:/Writer/w/w.txt");
        try {
            f.getParentFile().mkdirs();
            FileWriter fw=new FileWriter(f);
            String data="abcdefg1234567890";
            char[] cs = data.toCharArray();
            fw.write(cs);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
