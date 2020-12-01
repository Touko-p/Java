package Swing;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Clock1 {
    public static void main(String[]args){
        JFrame f=new JFrame();
        f.setBounds(200,200,400,300);
        f.setLayout(null);
        JLabel l1=new JLabel("北京时间：");
        l1.setBounds(150,60,150,30);
        l1.setFont(new Font("楷体",1,20));
        JLabel l=new JLabel();
        l.setBounds(40,100,330,40);
        l.setForeground(Color.red);
        l.setFont(new Font("楷体",2,30));
        Thread t=new Thread(){
            public void run(){
                while (true) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    Calendar c = Calendar.getInstance();
                    String time = sdf.format(c.getTime());
                    l.setText(time);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
        f.add(l);
        f.add(l1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
