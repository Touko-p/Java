package 文件;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void copyFile(String srcFile,String destFile){
        File f=new File(srcFile);
        File f1=new File(destFile);
        if(!f.exists()){
            System.out.println("该文件不存在");
            return;
        }
        try (FileReader fr=new FileReader(f); FileWriter fw=new FileWriter(f1)
        ){
            char[]cs=new char[(int)f.length()];
            fr.read(cs);
            String str=new String(cs);
            fw.write(str);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void main(String[]args){
        copyFile("D:/Model.txt","D:/Modle1.txt");
    }
}
