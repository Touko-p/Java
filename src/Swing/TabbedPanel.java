package Swing;

import javax.swing.*;
import java.awt.*;

public class TabbedPanel {
    public static void main(String[]args){
        JFrame f=new JFrame("我的窗口");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(null);
        JPanel p1 = new JPanel();
        p1.setBounds(50, 50, 300, 60);
        p1.setBackground(Color.cyan);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.BLUE);
        p2.setBounds(10, 150, 300, 60);
        JTabbedPane jp=new JTabbedPane();
        jp.add(p1);
        jp.add(p2);
        jp.setTitleAt(0,"一");
        jp.setTitleAt(1,"二");
        ImageIcon I=new ImageIcon("D:/Swing/j.png");
        jp.setIconAt(0,I);
        f.setContentPane(jp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
