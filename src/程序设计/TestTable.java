package 程序设计;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestTable {
    public static void main(String[]args){
        DecimalFormat df=new DecimalFormat("0.00");
        JFrame f=new JFrame("Test");
        f.setBounds(200,200,500,400);
        f.setLayout(new BorderLayout());
        String[] columnNames=new String[]{"编号","姓名","最高分","最低分","累积分","最后得分","排名"};
        String[][] persons=new String[][]{{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""}};
        JTable table=new JTable(persons,columnNames);
        table.setRowHeight(20);
        JScrollPane sp=new JScrollPane(table);
        JPanel p=new JPanel();
        JButton jb1=new JButton("读取初始成绩");
        JButton jb2=new JButton("显示最后成绩");
        JButton jb3=new JButton("获取排名");
        JButton jb4=new JButton("保存到文件");
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File f1=new File("D:/程序设计/f1.txt");
                if(f1.exists()) {
                    try (FileReader fr = new FileReader(f1); BufferedReader br = new BufferedReader(fr)) {
                        for (int z = 0; z < 999; z++) {
                            String str = br.readLine();
                            if (str == null)
                                break;
                            for (int j = 0; j < 5; j++) {
                                String[] newstr = str.split(" ");
                                float a[] = new float[newstr.length - 2];
                                int b = 0;
                                float sum = 0;
                                for (int i = 2; i < newstr.length; i++) {
                                    a[b] = Float.valueOf(newstr[i]);
                                    sum += a[b];
                                    b++;
                                }
                                Arrays.toString(a);
                                Arrays.sort(a);
                                float min = a[0];
                                float max = a[a.length - 1];
                                String string = "" + newstr[0] + " " + newstr[1] + " " + max + " " + min + " " + df.format(sum);
                                String[] newstring = string.split(" ");
                                persons[z][j] = newstring[j];
                            }
                        }
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(f,"文件已读取，点击表格后出现");
                }else
                    JOptionPane.showMessageDialog(f,"文件不存在，请将选手评分f1.txt文件放入D:/程序设计");
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(persons[0][0].length()==0){
                    JOptionPane.showMessageDialog(f,"获取初始成绩才可以获取最终成绩");
                    return;
                }
                else {
                    File f1 = new File("D:/程序设计/f1.txt");
                    try (FileReader fr = new FileReader(f1); BufferedReader br = new BufferedReader(fr)) {
                        for (int z = 0; z < 999; z++) {
                            String str = br.readLine();
                            if (str == null)
                                break;
                            for (int j = 0; j < 6; j++) {
                                String[] newstr = str.split(" ");
                                float a[] = new float[newstr.length - 2];
                                int b = 0;
                                float sum = 0;
                                for (int i = 2; i < newstr.length; i++) {
                                    a[b] = Float.valueOf(newstr[i]);
                                    sum += a[b];
                                    b++;
                                }
                                Arrays.toString(a);
                                Arrays.sort(a);
                                float min = a[0];
                                float max = a[a.length - 1];
                                float sumScore = 0;
                                float finalScore = 0;
                                if (a.length >= 9) {
                                    for (int i = 2; i < a.length - 2; i++) {
                                        sumScore += a[i];
                                    }
                                    finalScore = sumScore / (a.length - 4);
                                } else {
                                    for (int i = 1; i < a.length - 1; i++) {
                                        sumScore += a[i];
                                    }
                                    finalScore = sumScore / (a.length - 2);
                                }
                                String string = "" + newstr[0] + " " + newstr[1] + " " + max + " " + min + " " + sum + " " + df.format(finalScore);
                                String[] newstring = string.split(" ");
                                persons[z][5] = newstring[5];
                            }
                        }
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(f,"最终成绩已获取，点击表格后出现");
            }
        });
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(persons[0][5].length()==0){
                    JOptionPane.showMessageDialog(f,"获取最终成绩才可以获取排名");
                    return;
                }
                else {
                    HashMap<String, String> hs = new HashMap<>();
                    List<String> ls=new ArrayList<>();
                    for(int i=0;i<999;i++){
                        if(persons[i][5].length()==0)
                            break;
                        else
                            ls.add(persons[i][5]);
                    }
                    String sj[] = new String[ls.size()];
                    String sj1[] = new String[sj.length];
                    for (int i = 0; i < sj.length; i++) {
                        sj[i] = persons[i][5];
                    }
                    for (int i = 0; i < sj1.length; i++) {
                        sj1[i] = sj[i];
                    }
                    Arrays.toString(sj);
                    Arrays.sort(sj);
                    int h = 1;
                    for (int i = sj.length - 1; i >= 0; i--) {
                        hs.put(sj[i], String.valueOf(h));
                        h++;
                    }

                    for (int i = 0; i < sj.length; i++) {
                        persons[i][6] = hs.get(persons[i][5]);
                    }
                }
                JOptionPane.showMessageDialog(f,"排名已获取，点击表格后出现");
            }
        });
        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file=new File("D:/程序设计/f2.txt");
                if(!(file.exists())) {
                    file.getParentFile().mkdir();
                }
                String str1="---------------------------------------------------------------------------------";
                List<String> ls=new ArrayList<>();
                for(int i=0;i<999;i++){
                    if(persons[i][5].length()==0)
                        break;
                    else
                        ls.add(persons[i][5]);
                }
                try (FileWriter fw=new FileWriter(file);BufferedWriter bw=new BufferedWriter(fw)){
                    bw.write(str1+"\n");
                    bw.write(columnNames[0]+"\t"+columnNames[1]+"\t"+columnNames[2]+"\t"+columnNames[3]+"\t"+columnNames[4]+"\t"+columnNames[5]+"\t"+columnNames[6]+"\n");
                    for(int i=0;i<ls.size();i++){
                        for(int j=0;j<table.getColumnCount();j++){
                            String str=table.getValueAt(i,j).toString();
                            if(null==str)
                                break;
                            bw.write(str+"\t");
                        }
                        bw.write("\n");
                    }
                    bw.write(str1);
                }catch (IOException k){
                    k.printStackTrace();
                }
                JOptionPane.showMessageDialog(f,"数据保存成功，文件保存在"+file.getPath());
            }
        });
        p.add(jb1);p.add(jb2);p.add(jb3);p.add(jb4);
        f.add(p,BorderLayout.SOUTH);
        f.add(sp,BorderLayout.NORTH);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
