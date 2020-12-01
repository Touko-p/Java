package 登陆界面;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Show {
    public static void main(String[]args){
        JFrame f=new JFrame("LoL");
        f.setBounds(200,200,500,250);
        f.setLayout(null);
        JLabel jb=new JLabel("账号：");
        jb.setBounds(130,20,50,30);
        JTextField jf=new JTextField();
        jf.setBounds(180,20,120,30);
        JLabel jb1=new JLabel("密码：");
        jb1.setBounds(130,60,50,30);
        JPasswordField jf1=new JPasswordField();
        jf1.setBounds(180,60,120,30);
        JButton b1=new JButton("注册");
        b1.setBounds(130,100,80,30);
        JButton b2=new JButton("登录");
        b2.setBounds(215,100,80,30);
        JDialog jd=new JDialog(f);
        jd.setModal(true);
        jd.setTitle("LOL");
        jd.setBounds(200,100,500,600);
        jd.setLayout(null);
        JLabel lb1=new JLabel("查看指定用户：");
        lb1.setBounds(30,50,100,30);
        JTextField tf1=new JTextField();
        tf1.setBounds(140,50,80,30);
        JButton b3=new JButton("点击查看");
        b3.setBounds(230,50,100,30);
        JLabel lb2=new JLabel("查看所有用户");
        lb2.setBounds(30,90,100,30);
        JTextField tf2=new JTextField();
        tf2.setBounds(140,90,80,30);
        JButton b4=new JButton("点击查看");
        b4.setBounds(230,90,100,30);
        JLabel lb3=new JLabel("删除用户");
        lb3.setBounds(30,130,100,30);
        JTextField tf3=new JTextField();
        tf3.setBounds(140,130,80,30);
        JButton b5=new JButton("点击删除");
        b5.setBounds(230,130,100,30);
        JLabel lb4=new JLabel("修改密码");
        lb4.setBounds(30,170,100,30);
        JTextField tf4=new JTextField();
        tf4.setBounds(140,170,80,30);
        JPasswordField jf2=new JPasswordField();
        jf2.setBounds(140,210,80,30);
        JPasswordField jf3=new JPasswordField();
        jf3.setBounds(140,250,80,30);
        JButton b6=new JButton("点击修改");
        b6.setBounds(230,250,100,30);
        JTextArea ta=new JTextArea();
        ta.setLineWrap(true);
        ta.setBounds(30,380,430,180);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(0==jf.getText().length()||0==jf1.getText().length()){
                    JOptionPane.showMessageDialog(f,"账号或密码为空");
                    return;
                }else {
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection c= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=学生","sa","k2753219155");
                        Statement s=c.createStatement();
                        String name=jf.getText();
                        String psw=jf1.getText();
                        String sql="insert into Message values('"+name+"','"+psw+"')";
                        s.executeUpdate(sql);
                        JOptionPane.showMessageDialog(f,"注册成功");
                    }catch (SQLException k){
                        JOptionPane.showMessageDialog(f,"用户名已存在");
                    }catch (ClassNotFoundException l){
                        l.printStackTrace();
                    }
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(0==jf.getText().length()||0==jf1.getText().length()){
                    JOptionPane.showMessageDialog(f,"账号或密码为空");
                    return;
                }else {
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection c= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=学生","sa","k2753219155");
                        Statement s=c.createStatement();
                        String name=jf.getText();
                        String psw=jf1.getText();
                        String sql="select * from Message where NAME ='"+name+"'and PASSWORD='"+psw+"'";
                        ResultSet rs=s.executeQuery(sql);
                        if(rs.next()){
                            f.setVisible(false);
                            jd.setVisible(true);
                        }
                        else
                            JOptionPane.showMessageDialog(f,"用户名或密码错误");
                    }catch (ClassNotFoundException ee){
                        ee.printStackTrace();
                    }catch (SQLException ee){
                        ee.printStackTrace();
                    }
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(0==tf1.getText().length()){
                    JOptionPane.showMessageDialog(jd,"请输入宁需要查看用户的ID");
                    return;
                }else {
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection c= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=学生","sa","k2753219155");
                        Statement s=c.createStatement();
                        String name=tf1.getText();
                        String sql="select * from Message where NAME='"+name+"'";
                        ResultSet rs=s.executeQuery(sql);
                        if(rs.next()){
                            String id=rs.getString("NAME");
                            String Psw=rs.getString("PASSWORD");
                            String st="用户名："+id+"密码："+Psw;
                            ta.append(st);
                        }else
                            JOptionPane.showMessageDialog(jd,"该用户不存在");

                    }catch (SQLException ee){
                        ee.printStackTrace();
                    }catch (ClassNotFoundException ee){
                        ee.printStackTrace();
                    }
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection c= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=学生","sa","k2753219155");
                        Statement s=c.createStatement();
                        String sql="select * from Message";
                        ResultSet rs=s.executeQuery(sql);
                        while (rs.next()){
                            String id=rs.getString("NAME");
                            String Psw=rs.getString("PASSWORD");
                            String st="用户名："+id+"密码："+Psw+"\n";
                            ta.append(st);
                        }

                    }catch (SQLException ee){
                        ee.printStackTrace();
                    }catch (ClassNotFoundException ee){
                        ee.printStackTrace();
                    }
                }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(0==tf3.getText().length()) {
                    JOptionPane.showMessageDialog(jd, "请输入宁需要查看用户的ID");
                    return;
                }else {
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection c= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=学生","sa","k2753219155");
                        Statement s=c.createStatement();
                        String name=tf3.getText();
                        String sql="delete Message where NAME='"+name+"'";
                        s.executeUpdate(sql);
                        JOptionPane.showMessageDialog(jd,"用户已删除");
                    }catch (SQLException ee){
                        ee.printStackTrace();
                    }catch (ClassNotFoundException ee){
                        ee.printStackTrace();
                    }
                }
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(0==tf4.getText().length()||0==jf2.getText().length()||0==jf3.getText().length()){
                    JOptionPane.showMessageDialog(jd,"请输入完整数据");
                    return;
                }else {
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection c= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=学生","sa","k2753219155");
                        Statement s=c.createStatement();
                        String name=tf4.getText();
                        String opsw=jf2.getText();
                        String npsw=jf3.getText();
                        String sql="update Message set PASSWORD='"+npsw+"'where NAME='"+name+"'";
                        String sql1="select PASSWORD from Message where NAME='"+name+"'";
                        ResultSet rs=s.executeQuery(sql1);
                        if(rs.next()){
                            String Opsw=rs.getString("PASSWORD");
                            if(opsw.equals(Opsw)){
                                s.executeUpdate(sql);
                                JOptionPane.showMessageDialog(jd,"修改成功");
                            }else
                                JOptionPane.showMessageDialog(jd,"修改失败");
                        }
                    }catch (SQLException ee){
                        ee.printStackTrace();
                    }catch (ClassNotFoundException ee){
                        ee.printStackTrace();
                    }
                }

            }
        });
        jd.add(lb1);jd.add(tf1);jd.add(b3);
        jd.add(lb2);jd.add(b4);
        jd.add(lb3);jd.add(tf3);jd.add(b5);jd.add(ta);
        jd.add(lb4);jd.add(tf4);jd.add(jf2);jd.add(jf3);jd.add(b6);
        f.add(b1);f.add(b2);
        f.add(jb);f.add(jb1);
        f.add(jf);f.add(jf1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
