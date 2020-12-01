package Swing;

import javax.swing.*;
import java.awt.*;

public class progress {
    public static void main(String[]args){
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new FlowLayout());
        JProgressBar pb = new JProgressBar();
        //进度条最大100
        pb.setMaximum(100);
        Thread t1=new Thread(){
            int b=100;
            public void run(){
                for(int i=0;i<101;i++){
                    pb.setValue(i);
                    try {
                        Thread.sleep(b);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    pb.setStringPainted(true);
                    b+=100;
                }
            }
        };
        t1.start();
        f.add(pb);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
