package 文件;
//查询文件中的文件内容
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class searchFile {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入您需要查找的文件");
        String file=scan.next();
        File folder=new File(file);
        System.out.println("请输入您需要查找的内容");
        String content=scan.next();
        search(folder,content);
    }
    public static void search(File folder,String search){
        File[] files=folder.listFiles();
        if(null!=files){
            for(File file:files){
                if(file.isDirectory()){//如果是文件夹继续查询
                    search(file,search);
                }else {
                    String name=file.getName();
                    if(name.endsWith(".java")){
                        try(BufferedReader br=new BufferedReader(new FileReader(file))) {
                                while (true){
                                String str=br.readLine();
                                if(str==null)
                                    break;
                                if(str.contains(search))
                                    System.out.println("找到目标字符串"+search+",在文件："+file.getAbsolutePath());
                            }
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
