package 文件;
//缓冲流读取文件内容

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Buffered {
    public static void main(String[]args){
        File f=new File("D:/BufferedReader.txt");
        try(FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
        ){  while (true){
            String line=br.readLine();
            if(null==line)
                break;
            System.out.println(line);}
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
