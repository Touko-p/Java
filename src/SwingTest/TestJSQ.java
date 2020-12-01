package SwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TestJSQ {
    public static void main(String[]args){
        JFrame f=new JFrame("计算器");
        f.setBounds(200,200,360,300);
        f.setLayout(null);
        JTextField tf=new JTextField();
        tf.setSize(400,40);
        JPanel p=new JPanel();
        p.setBounds(0,40,350,300);
        p.setLayout(new FlowLayout());
        String s[]={"1","2","3","+","C","4","5","6","-","退格","7","8","9","+","1/x","0","+/-",".","/","="};
        for (int i=0;i<s.length;i++){
            JButton b=new JButton(s[i]);
            p.add(b);
            b.setPreferredSize(new Dimension(60,50));
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tf.getText();
                }
            });
        }
        f.add(tf);f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
