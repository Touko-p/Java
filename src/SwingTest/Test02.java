package SwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Test02 {
    public static void main(String[]args){
        JFrame jf=new JFrame("LOL");
        jf.setBounds(200,200,400,300);
        jf.setLayout(new FlowLayout());
        JLabel jl=new JLabel("账号：");
        JTextField tf=new JTextField();
        tf.setPreferredSize(new Dimension(80,30));
        JLabel j2=new JLabel("密码：");
        JPasswordField pf=new JPasswordField();
        pf.setPreferredSize(new Dimension(80,30));
        JButton b=new JButton("登录");
        b.setBounds(190,200,40,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(0==tf.getText().length()||0==pf.getText().length()){
                    JOptionPane.showMessageDialog(jf,"账号或密码为空");
                    return;
                }else {
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection c= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=学生","sa","k2753219155");
                        Statement s=c.createStatement();
                        String name=tf.getText();
                        String psw=pf.getText();
                        String sql="select * from Message where NAME ='"+name+"'and PASSWORD='"+psw+"'";
                        ResultSet rs=s.executeQuery(sql);
                        if(rs.next())
                            JOptionPane.showMessageDialog(jf,"登陆成功");
                        else
                            JOptionPane.showMessageDialog(jf,"用户名或密码错误");
                    }catch (ClassNotFoundException ee){
                        ee.printStackTrace();
                    }catch (SQLException ee){
                        ee.printStackTrace();
                    }
                }
            }
        });
        jf.add(jl);
        jf.add(tf);
        jf.add(j2);
        jf.add(pf);
        jf.add(b);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
