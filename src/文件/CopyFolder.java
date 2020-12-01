package 文件;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFolder {
    public static void copyFolder(File srcFolder, File destFolder){
        if(!srcFolder.exists()||!srcFolder.isDirectory()||!destFolder.exists()||!destFolder.isDirectory()){
            return;
        }
        File f2[]=srcFolder.listFiles();
        for(File file:f2){
            if(file.isFile()){
                File f3=new File(destFolder,file.getName());
                copyFile(file,f3);
            }
            if(file.isDirectory()){
                File f4=new File(destFolder,file.getName());
                copyFolder(file,f4);
            }
        }
    }
    public static void copyFile(File srcFile,File destFile){
        if(!srcFile.exists()){
            System.out.println("该文件不存在");
            return;
        }
        try (FileReader fr=new FileReader(srcFile); FileWriter fw=new FileWriter(destFile)
        ){
            char[]cs=new char[(int)srcFile.length()];
            fr.read(cs);
            String str=new String(cs);
            fw.write(str);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
       File f=new File("D:/File");
       File f2=new File("D:/File1");
       copyFolder(f,f2);
    }


}
