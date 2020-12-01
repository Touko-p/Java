package 文件;
//去除注释
import java.io.*;

public class Delete {
    public static  void removeComments(File f1){
        //判断文件是否存在
        if(!f1.exists()){
            return;
        }
        StringBuffer sb=new StringBuffer();
        try (FileReader fr=new FileReader(f1);
            BufferedReader br=new BufferedReader(fr)){
            while (true){
                String line=br.readLine();
                if(null==line)
                    break;
                if(!line.trim().startsWith("//")){
                    sb.append(line);
                    sb.append("\r\n");
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }try (FileWriter fw=new FileWriter(f1);
              PrintWriter pw=new PrintWriter(fw)){
            pw.write(sb.toString());

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[]args){
        File f=new File("D:/Delete.txt");
        removeComments(f);
    }
}
