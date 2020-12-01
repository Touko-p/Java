package 文件;
//密码加密
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilePsw {
    public static void encodeFile(File encodingFile,File encodedFile){
        FileReader fr=null;
        FileWriter fw=null;
        char[]c=new char[(int)encodingFile.length()];
        try {
            fr=new FileReader(encodingFile);
            fr.read(c);
            System.out.print("源文件的字符串：");
            System.out.println(c);
            System.out.print("加密后的字符串:");
            for(int i=0;i<c.length;i++){
                if ('0' <= c[i] && c[i] <= '9' || 'A' <= c[i] && c[i] <= 'Z' || 'a' <= c[i] && c[i] <= 'z'){
                    if(c[i]=='9'){
                        c[i]=0;
                    }else if (c[i]=='z'){
                        c[i]='a';
                    }else if(c[i]=='Z'){
                        c[i]='A';
                    }else {
                        c[i]++;
                    }
                }
            }
            System.out.println(c);
            fw=new FileWriter(encodedFile);
            fw.write(c);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(fr!=null){
                    fr.close();
                }
                if(fw!=null){
                    fw.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static void dncodeFile(File dncodingFile,File dncodedFile){
        FileReader fr=null;
        FileWriter fw=null;
        char[]c=new char[(int)dncodingFile.length()];
        try {
            fr=new FileReader(dncodingFile);
            fr.read(c);
            System.out.print("源文件的字符串：");
            System.out.println(c);
            System.out.print("解密后的字符串:");
            for(int i=0;i<c.length;i++){
                if ('0' <= c[i] && c[i] <= '9' || 'A' <= c[i] && c[i] <= 'Z' || 'a' <= c[i] && c[i] <= 'z'){
                    if(c[i]=='9'){
                        c[i]=0;
                    }else if (c[i]=='z'){
                        c[i]='a';
                    }else if(c[i]=='Z'){
                        c[i]='A';
                    }else {
                        c[i]--;
                    }
                }
            }
            System.out.println(c);
            fw=new FileWriter(dncodedFile);
            fw.write(c);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(fr!=null){
                    fr.close();
                }
                if(fw!=null){
                    fw.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[]args){
        File f1=new File("D:/Psw.txt");
        File f2=new File("D:/Psw.txt");
        File f3=new File("D:/Psw.txt");
        encodeFile(f1,f2);
        dncodeFile(f2,f3);
    }
}
