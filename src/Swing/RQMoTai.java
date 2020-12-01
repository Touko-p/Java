package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RQMoTai {
    public static void main(String[]args){
        JFrame jf=new JFrame("模态");
        jf.setSize(800,600);
        jf.setLocation(200,100);
        jf.setLayout(null);
        JButton jb=new JButton("打开一个模态窗口");
        jb.setBounds(300,200,200,40);
        JDialog jd=new JDialog(jf);
        jd.setModal(true);
        jd.setTitle("模态的对话框");
        jd.setSize(400,300);
        jd.setLocation(400,200);
        jd.setLayout(null);
        JButton b = new JButton("锁定大小");
        b.setBounds(50, 50, 280, 30);
        jd.add(b);
        jf.add(jb);
        jb.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                jd.setVisible(true);
            }
        });

        b.addActionListener(new ActionListener() {
            boolean a=false;
            public void actionPerformed(ActionEvent e) {
                a=!a;
                b.setText(a?"解锁大小":"锁定大小");
                jd.setResizable(!a);
            }
        });
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
