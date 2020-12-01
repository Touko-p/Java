package 文件;
//创建类
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CJclass {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入类的名称：");
        String className = scan.nextLine();
        System.out.println("请输入属性的类型：");
        String type = scan.nextLine();
        System.out.println("请输入属性的名称：");
        String property = scan.nextLine();
        String Uproperty = toUpperFirstLetter(property);
        File f=new File("D:/Model.txt");
        String model=null;
        try (FileReader fr=new FileReader(f)){
            char []cs=new char[(int)f.length()];
            fr.read(cs);
            model=new String(cs);
        }catch (IOException e){
            e.printStackTrace();
        }
        String fileContent=model.replaceAll("@class@",className);
        fileContent=fileContent.replaceAll("@type@",type);
        fileContent=fileContent.replaceAll("@property@",property);
        fileContent=fileContent.replaceAll("@Uproperty@",Uproperty);
        String fileName=className+".java";
        System.out.println("替换后的内容");
        System.out.println(fileContent);
        File file=new File("D:/File",fileName);
        try (FileWriter fw=new FileWriter(file)){
            fw.write(fileContent);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("文件保存在："+file.getAbsolutePath());
    }
    //首字母转大写
    private static String toUpperFirstLetter(String property) {
        char upperCaseFirst =Character.toUpperCase(property.charAt(0));
        String rest = property.substring(1);
        return upperCaseFirst + rest;
    }
}
