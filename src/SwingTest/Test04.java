package SwingTest;

import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import java.awt.*;

public class Test04 {
    public static void main(String[]args){
        JFrame f=new JFrame();
        f.setBounds(200,200,400,600);
        f.setLayout(null);
        JPanel p=new JPanel();
        p.setBounds(20,20,360,180);
        p.setLayout(new GridLayout(4,3,10,20));
        JLabel a=new JLabel("起始资金");
        JTextField j=new JTextField();
        JLabel b=new JLabel("￥");
        JLabel a1=new JLabel("每年收益");
        JTextField j1=new JTextField();
        JLabel b1=new JLabel("%");
        JLabel a2=new JLabel("复利年数");
        JTextField j2=new JTextField();
        JLabel b2=new JLabel("年");
        JLabel a3=new JLabel("每年追加资金");
        JTextField j3=new JTextField();
        JLabel b3=new JLabel("￥");
        JButton B=new JButton("计算");
        B.setBounds(170,210,80,30);
        JPanel p1=new JPanel();
        p1.setBounds(20,20,360,400);
        p1.setLayout(new GridLayout(4,3,10,20));
        JLabel a4=new JLabel("本金和");
        JTextField j4=new JTextField();
        JLabel b4=new JLabel("￥");
        JLabel a5=new JLabel("利息和");
        JTextField j5=new JTextField();
        JLabel b5=new JLabel("￥");
        JLabel a6=new JLabel("本息和");
        JTextField j6=new JTextField();
        JLabel b6=new JLabel("￥");
        p.add(a);p.add(j);p.add(b);
        p.add(a1);p.add(j1);p.add(b1);
        p.add(a2);p.add(j2);p.add(b2);
        p.add(a3);p.add(j3);p.add(b3);
        p.add(a4);p.add(j4);p.add(b4);
        p.add(a5);p.add(j5);p.add(b5);
        p.add(a6);p.add(j6);p.add(b6);
        f.add(p);f.add(B);f.add(p1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
