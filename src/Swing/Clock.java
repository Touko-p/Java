package Swing;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Clock extends JFrame implements Runnable {
    public static JLabel l;
    public static Clock f;
    @Override
    public void run() {
        while (true){
            SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Calendar c=Calendar.getInstance();
            String str=s.format(c.getTime());
            l.setText(str);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
    public static void main(String[]args){
        f=new Clock();
        f.setLayout(new FlowLayout());
        l=new JLabel();
        l.setFont(new Font("宋体",1,20));
        l.setForeground(Color.red);
        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(200,200,400,200);
        f.setVisible(true);
        Thread t=new Thread(f);
        t.start();
    }
}
