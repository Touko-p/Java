package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SplitPanel {
    public static void main(String[]args){
        JFrame f=new JFrame("LOL");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(null);
        JPanel jp=new JPanel();
        jp.setBounds(50, 50, 300, 60);
        jp.setLayout(new FlowLayout());
        jp.setBackground(Color.blue);
        JButton b1 = new JButton("盖伦");
        JButton b2 = new JButton("提莫");
        JButton b3 = new JButton("安妮");
        jp.add(b1);
        jp.add(b2);
        jp.add(b3);

        JPanel jp1=new JPanel();
        jp1.setBackground(Color.red);
        jp1.setBounds(10, 150, 300, 60);
        JSplitPane jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jp,jp1);
        jsp.setDividerLocation(80);
        JLabel jl=new JLabel();
        jp1.add(jl);

        ImageIcon i=new ImageIcon("D:/Swing/annie.jpg");
        ImageIcon i1=new ImageIcon("D:/Swing/gareen.jpg");
        ImageIcon i2=new ImageIcon("D:/Swing/teemo.jpg");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setIcon(i1);
                jl.setBounds(50, 50, i1.getIconWidth(), i1.getIconHeight());
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setIcon(i2);
                jl.setBounds(50,50,i2.getIconWidth(),i2.getIconHeight());
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setIcon(i);
                jl.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
            }
        });
        f.setContentPane(jsp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
