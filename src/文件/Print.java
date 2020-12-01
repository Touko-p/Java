package 文件;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print {
    public static void main(String[]args){
        File f=new File("D:/BufferedReader.txt");
        try (FileWriter fw=new FileWriter(f);
             PrintWriter pw=new PrintWriter(fw);
        ){
             pw.println("hahaha");
             //强制把缓存中的数据写入硬盘，无论缓存是否已满
             pw.flush();
             pw.println("I'm big monster");
             pw.flush();
             pw.println("You need to die");
             pw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
