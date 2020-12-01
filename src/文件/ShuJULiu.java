package 文件;

import java.io.*;

public class ShuJULiu {
    public static void Print(File f){
        if(!f.exists()){
            return;
        }
        try (FileWriter fw=new FileWriter(f); PrintWriter pw=new PrintWriter(fw)){
            String line="32@12";
            pw.write(line);
        }catch (IOException e){
            e.printStackTrace();
        }try (FileReader fr=new FileReader(f); BufferedReader br=new BufferedReader(fr)){
            String line=br.readLine();
            String temp[]=line.split("@");
            for(int i=0;i<temp.length;i++){
                System.out.println(Integer.valueOf(temp[i]));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void Write(File f1){
        if(!f1.exists()){
            return;
        }
        try(FileOutputStream fos=new FileOutputStream(f1);DataOutputStream dos=new DataOutputStream(fos)) {
            dos.writeInt(32);
            dos.writeInt(12);
        }catch (IOException e){
            e.printStackTrace();
        }try(FileInputStream fis=new FileInputStream(f1);DataInputStream dis=new DataInputStream(fis)) {
            System.out.println(dis.readInt());
            System.out.println(dis.readInt());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        File f=new File("D:/Delete.txt");
        Print(f);
        Write(f);
    }

}
