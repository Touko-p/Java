package SwingTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test01 {
    public static void main(String[]args){
        JFrame f=new JFrame("为空判断");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(null);
        JTextField jf=new JTextField();
        jf.setSize(80,30);
        jf.setLocation(20,20);
        JButton jb=new JButton("检测");
        jb.setBounds(100,20,80,30);
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(0==jf.getText().length()){
                    JOptionPane.showMessageDialog(f,"文本框为空");
                return;
                }
                try{
                    Integer.parseInt(jf.getText());
                    JOptionPane.showMessageDialog(f,"是数字");
                }catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(f,"不是数字");
                    jf.grabFocus();
                }

            }
        });
        f.add(jb);
        f.add(jf);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
