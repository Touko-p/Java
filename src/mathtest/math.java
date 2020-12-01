package mathtest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class math {
    public static void main(String[] ags){
        JFrame f=new JFrame("数学考试");
        f.setBounds(200,100,500,600);
        f.setLayout(null);
        JTextField jf1=new JTextField();
        jf1.setBounds(100,100,50,30);
        JLabel lb=new JLabel("+");
        lb.setBounds(160,100,30,30);
        JTextField jf2=new JTextField();
        jf2.setBounds(180,100,50,30);
        JLabel lb1=new JLabel("=");
        lb1.setBounds(240,100,30,30);
        JTextField jf3=new JTextField();
        jf3.setBounds(260,100,50,30);
        JButton jb=new JButton("提交答案");
        jb.setBounds(320,100,100,30);
        JButton jb1=new JButton("出题");
        jb1.setBounds(230,50,60,30);
        JTextArea ta=new JTextArea();
        ta.setBounds(100,150,320,350);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        jf1.setText(String.valueOf((int) (Math.random() * 100)));
                        jf2.setText(String.valueOf((int) (Math.random() * 100)));
                        jf3.setText(null);
                }
        });
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jf3.getText().length()==0){
                    JOptionPane.showMessageDialog(f,"你的答案还未输入");
                }
                else{
                     int str1= Integer.parseInt(jf1.getText());
                     int str2= Integer.parseInt(jf2.getText());
                     String sum= String.valueOf(str1+str2);
                     if(sum.equals(jf3.getText())){
                         JOptionPane.showMessageDialog(f,"你真棒，Good Boy！！！");
                     }else
                         JOptionPane.showMessageDialog(f,"错了");
                     ta.append(jf1.getText()+"+"+jf2.getText()+"="+sum+"\n");
                }
            }
        });
        f.add(jf1);f.add(lb);f.add(jf2);f.add(lb1);f.add(jf3);f.add(jb);f.add(jb1);f.add(ta);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
