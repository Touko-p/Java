package Swing;

import javax.swing.*;
import java.awt.*;

public class JSQLayOut {
    public static void main(String[]args){
        JFrame jf=new JFrame("计算器");
        jf.setSize(360,280);
        jf.setLayout(new FlowLayout());
        String[] s={"7","8","9","/","sq","4","5","6","*","%","1","2","3","-","1/x","0","+/-",".","+","="};
        for(int i=0;i<s.length;i++){
            JButton b=new JButton(s[i]);
            jf.add(b);
            b.setPreferredSize(new Dimension(60,50));
        }
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
