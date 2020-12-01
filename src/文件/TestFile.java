package 文件;

import java.io.File;
import java.util.Date;

public class TestFile {
    public static void main(String[]args){
        File f=new File("D:/Battle.net/Battle.net.exe");
        System.out.println("f的绝对路径："+f.getAbsolutePath());
        System.out.println("当前文件是："+f);
        System.out.println("判断文件是否存在:"+f.exists());
        System.out.println("判断是否文件夹："+f.isDirectory());
        System.out.println("判断是否文件："+f.isFile());
        System.out.println("获取文件长度："+f.length());
        //文件最后修改时间
        long time=f.lastModified();
        Date d=new Date(time);
        f.setLastModified(0);//设置文件最后修改时间
        System.out.println("获取文件最后修改时间:"+d);
        File f3=new File("D:/Battle.net/Battle.net.exe");
        f.renameTo(f3);//修改文件名
        File f1=new File("Battle.net.exe");
        System.out.println("f1的绝对路径："+f1.getAbsolutePath());
        File f2=new File(f,"Battle.net.exe");
        System.out.println("f2的绝对路径:"+f2.getAbsolutePath());

    }
}
