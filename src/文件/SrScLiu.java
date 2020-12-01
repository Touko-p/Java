package 文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SrScLiu {
    public static void main(String[]args){
        File f=new File("D:/Battle.net");
        try {
            FileInputStream k=new FileInputStream(f);
            FileOutputStream g=new FileOutputStream(f);

        }catch (FileNotFoundException k){
            k.printStackTrace();
        }
    }
}
