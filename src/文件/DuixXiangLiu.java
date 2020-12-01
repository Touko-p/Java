package 文件;


import 集合框架.Hero;

import java.io.*;

public class DuixXiangLiu {
    public static void main(String[]args){
        Hero[] hs=new Hero[10];
        for(int i=0;i<hs.length;i++){
            hs[i]=new Hero("hero"+i);
        }
        File f=new File("D:/hero.lol");
        try (FileOutputStream fos=new FileOutputStream(f);
             ObjectOutputStream oos=new ObjectOutputStream(fos);
             FileInputStream fis=new FileInputStream(f);
             ObjectInputStream ois=new ObjectInputStream(fis)){
            oos.writeObject(hs);
            Hero[] hs1=(Hero[])ois.readObject();
            System.out.println("查看文件中反序列化出来的数组中的每一个元素:");
            for(Hero h:hs1){
                System.out.println(h.name);
            }

        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
