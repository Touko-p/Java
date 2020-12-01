package 程序设计;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class addressBookSystem {
    public static void main(String[]args){
        JFrame f=new JFrame("通讯录系统");
        f.setBounds(200,100,700,500);
        f.setLayout(new BorderLayout());
        JLabel lb1=new JLabel("编号");JTextField tf1=new JTextField();
        JLabel lb2=new JLabel("姓名");JTextField tf2=new JTextField();
        JLabel lb3=new JLabel("性别");JTextField tf3=new JTextField();
        JLabel lb4=new JLabel("电话");JTextField tf4=new JTextField();
        JLabel lb5=new JLabel("地址");JTextField tf5=new JTextField();
        JLabel lb6=new JLabel("Email");JTextField tf6=new JTextField();
        lb1.setBounds(0,10,50,30);tf1.setBounds(150,5,150,40);
        lb2.setBounds(0,60,50,30);tf2.setBounds(150,55,150,40);
        lb3.setBounds(0,110,50,30);tf3.setBounds(150,105,150,40);
        lb4.setBounds(350,10,50,30);tf4.setBounds(450,5,200,40);
        lb5.setBounds(350,60,50,30);tf5.setBounds(450,55,200,40);
        lb6.setBounds(350,110,50,30);tf6.setBounds(450,105,200,40);
        JButton jb1=new JButton("查询");JButton jb2=new JButton("增加");
        JButton jb3=new JButton("删除");JButton jb4=new JButton("显示所有");
        jb1.setBounds(0,150,175,40);jb2.setBounds(175,150,175,40);
        jb3.setBounds(350,150,175,40);jb4.setBounds(525,150,175,40);
        JPanel p1=new JPanel();
        p1.setBounds(0,0,700,300);
        p1.setLayout(null);
        String[] columnNames=new String[]{"编号","姓名","性别","电话","地址","Email"};
        String[][] persons=new String[][]{{"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""}};
        JTable table=new JTable(persons,columnNames);
        JScrollPane sp=new JScrollPane(table);
        JPanel p2=new JPanel();
        p2.setBounds(0,200,700,200);
        table.setRowHeight(20);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf1.getText().length()==0&&tf2.getText().length()==0&&tf3.getText().length()==0&&tf4.getText().length()==0&&tf5.getText().length()==0&&tf6.getText().length()==0){
                    JOptionPane.showMessageDialog(f,"请输入编号或姓名查询用户信息");
                    return;
                }else {
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection c= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=通讯录系统","sa","k2753219155");
                        Statement s=c.createStatement();
                        String number=tf1.getText();
                        String name=tf2.getText();
                        if(tf1.getText().length()!=0){
                            String s1="select * from Message where Number='"+number+"'";
                            ResultSet rs=s.executeQuery(s1);
                            if(rs.next()){
                                String num=rs.getString("Number");
                                String nam=rs.getString("Name");
                                String sex=rs.getString("Sex");
                                String pnum=rs.getString("PhoneNumber");
                                String sit=rs.getString("Site");
                                String ema=rs.getString("Email");
                                String a[]={num,nam,sex,pnum,sit,ema};
                                if(num.equals(number)){
                                    for(int i=0;i<a.length;i++){
                                        persons[0][i]=a[i];
                                    }
                                    JOptionPane.showMessageDialog(f,"用户已查询，点击表格第一行刷新");
                                }
                            }else
                                JOptionPane.showMessageDialog(f,"用户不存在，查询失败");
                        }else if(tf2.getText().length()!=0){
                            String s1="select * from Message where Name='"+name+"'";
                            ResultSet rs=s.executeQuery(s1);
                            if(rs.next()){
                                String num=rs.getString("Number");
                                String nam=rs.getString("Name");
                                String sex=rs.getString("Sex");
                                String pnum=rs.getString("PhoneNumber");
                                String sit=rs.getString("Site");
                                String ema=rs.getString("Email");
                                String a[]={num,nam,sex,pnum,sit,ema};
                                if(nam.equals(name)){
                                    for(int i=0;i<a.length;i++){
                                        persons[0][i]=a[i];
                                    }
                                    JOptionPane.showMessageDialog(f,"用户已查询，点击表格第一行刷新");
                                }
                            }else
                                JOptionPane.showMessageDialog(f,"用户不存在，查询失败");
                        }else {
                            JOptionPane.showMessageDialog(f,"请输入编号或姓名查询用户信息");
                        }
                    }catch (SQLException k){
                        k.printStackTrace();
                    }catch (ClassNotFoundException k){
                        k.printStackTrace();
                    }
                    tf1.setText(null);tf2.setText(null);tf3.setText(null);
                    tf4.setText(null);tf5.setText(null);tf6.setText(null);
                }
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf1.getText().length()==0||tf2.getText().length()==0||tf3.getText().length()==0||tf4.getText().length()==0||tf5.getText().length()==0||tf6.getText().length()==0){
                    JOptionPane.showMessageDialog(f,"输入完整信息方可增加成功");
                    return;
                }else {
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection c= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=通讯录系统","sa","k2753219155");
                        Statement s=c.createStatement();
                        String number=tf1.getText();
                        String name=tf2.getText();
                        String sex=tf3.getText();
                        String phonenumber=tf4.getText();
                        String site=tf5.getText();
                        String emali=tf6.getText();
                        String sql="insert into Message values('"+number+"','"+name+"',' "+sex+"',' "+phonenumber+"',' "+site+"',' "+emali+"')";
                        s.executeUpdate(sql);
                        JOptionPane.showMessageDialog(f,"用户已增加");
                        tf1.setText(null);tf2.setText(null);tf3.setText(null);
                        tf4.setText(null);tf5.setText(null);tf6.setText(null);
                    }catch (SQLException k){
                        k.printStackTrace();
                    }catch (ClassNotFoundException k){
                        k.printStackTrace();
                    }
                }
            }
        });
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf1.getText().length()==0&&tf2.getText().length()==0&&tf3.getText().length()==0&&tf4.getText().length()==0&&tf5.getText().length()==0&&tf6.getText().length()==0){
                    JOptionPane.showMessageDialog(f,"请输入编号或姓名删除用户信息");
                    return;
                }else {
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection c= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=通讯录系统","sa","k2753219155");
                        Statement s=c.createStatement();
                        String number=tf1.getText();
                        String name=tf2.getText();
                        if(tf1.getText().length()!=0){
                            String s1="select Number from Message where Number='"+number+"'";
                            ResultSet rs=s.executeQuery(s1);
                            if(rs.next()){
                                String num=rs.getString("Number");
                                if(num.equals(number)){
                                    String sql="delete from Message where Number='"+number+"'";
                                    s.executeUpdate(sql);
                                    JOptionPane.showMessageDialog(f,"用户已删除");
                                }
                            }else
                                JOptionPane.showMessageDialog(f,"用户不存在，删除失败");
                        }else if(tf2.getText().length()!=0) {
                            String s1="select Name from Message where Name='"+name+"'";
                            ResultSet rs=s.executeQuery(s1);
                            if(rs.next()){
                                String num=rs.getString("Name");
                                if(num.equals(name)){
                                    String sql="delete from Message where Name='"+name+"'";
                                    s.executeUpdate(sql);
                                    JOptionPane.showMessageDialog(f,"用户已删除");
                                }
                            }else
                                JOptionPane.showMessageDialog(f,"用户不存在，删除失败");
                        }else {
                            JOptionPane.showMessageDialog(f,"请输入编号或姓名删除用户信息");
                        }
                        tf1.setText(null);tf2.setText(null);tf3.setText(null);
                        tf4.setText(null);tf5.setText(null);tf6.setText(null);
                    }catch (SQLException k){
                        k.printStackTrace();
                    }catch (ClassNotFoundException k){
                        k.printStackTrace();
                    }
                }
            }
        });
        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection c= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=通讯录系统","sa","k2753219155");
                    Statement s=c.createStatement();
                    String sql="select * from Message";
                    ResultSet rs=s.executeQuery(sql);
                    int h=0;
                    while (rs.next()){
                        String num=rs.getString("Number");
                        String nam=rs.getString("Name");
                        String sex=rs.getString("Sex");
                        String pnum=rs.getString("PhoneNumber");
                        String sit=rs.getString("Site");
                        String ema=rs.getString("Email");
                        String a[]={num,nam,sex,pnum,sit,ema};
                        for(int i=0;i<a.length;i++){
                            persons[h][i]=a[i];
                        }
                        h++;
                    }
                    JOptionPane.showMessageDialog(f,"所有信息已查询，点击表格刷新");
                }catch (SQLException k){
                    k.printStackTrace();
                }catch (ClassNotFoundException k){
                    k.printStackTrace();
                }
            }
        });
        p1.add(lb1);p1.add(lb2);p1.add(lb3);p1.add(lb4);p1.add(lb5);p1.add(lb6);
        p1.add(tf1);p1.add(tf2);p1.add(tf3);p1.add(tf4);p1.add(tf5);p1.add(tf6);
        p1.add(jb1);p1.add(jb2);p1.add(jb3);p1.add(jb4);p2.add(sp);
        f.add(p2);
        f.add(p1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
