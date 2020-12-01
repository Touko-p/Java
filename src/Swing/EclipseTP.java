package Swing;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class EclipseTP {
    public static void main(String[]args){
        JFrame f=new JFrame("Eclipse");
        f.setSize(900,600);
        f.setLocation(200,200);
        f.setLayout(null);
        File fl=new File("D:/e编译器/This/src");
        File[] files=fl.listFiles();
        int len=files.length;
        JTabbedPane tp=new JTabbedPane();
        tp.setSize(f.getWidth(),f.getHeight());
        for(int i=0;i<len;i++){
            File f2=files[i];
            JPanel jp=new JPanel();
            jp.setLayout(new BorderLayout());
            try(Reader r=new FileReader(f2);
                BufferedReader br=new BufferedReader(r);
                ) {
            JTextArea ta=new JTextArea();
            ta.setSize(jp.getWidth(),jp.getHeight());
            String str;
            while ((str=br.readLine())!=null){
                ta.append(str);
                ta.append("\n");
            }
            JScrollPane sp=new JScrollPane(ta);
            jp.add(sp);
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
            tp.add(jp);
            tp.setTitleAt(i,f2.getName());
        }
            f.setContentPane(tp);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);

    }
}
