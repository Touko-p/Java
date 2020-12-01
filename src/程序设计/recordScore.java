package 程序设计;

import javax.swing.*;
import java.awt.*;

public class recordScore {
    public static void main(String[]args){
        JFrame f=new JFrame("选手计分系统");
        f.setBounds(200,200,500,400);
        f.setLayout(new BorderLayout());
        String[] columnNames=new String[]{"编号","姓名","最高分","最低分","累积分","最后得分"};
        String[][] persons=new String[][]{{"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""}};
        JTable table=new JTable(persons,columnNames);
        table.setRowHeight(20);
        JScrollPane sp=new JScrollPane(table);
        JPanel jp=new JPanel();
        JButton jb1=new JButton("读取初始成绩");
        JButton jb2=new JButton("显示最后成绩");
        JButton jb3=new JButton("保存到文件");
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);
        f.add(sp,BorderLayout.NORTH);f.add(jp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
