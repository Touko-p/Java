package SwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test03 {
    public static void main(String[]args){
        JFrame jf=new JFrame("黄鹤");
        jf.setBounds(200,200,600,520);
        jf.setLayout(null);
        JPanel jp=new JPanel();
        jp.setBounds(10, 10, 560, 160);
        jp.setLayout(new GridLayout(4, 4, 10, 10));
        JLabel j1=new JLabel("地名：");
        JTextField tf1=new JTextField();
        JLabel j2=new JLabel("公司类型：");
        JTextField tf2=new JTextField();
        JLabel j3=new JLabel("公司名称：");
        JTextField tf3=new JTextField();
        JLabel j4=new JLabel("老板名称：");
        JTextField tf4=new JTextField();
        JLabel j5=new JLabel("金额：");
        JTextField tf5=new JTextField();
        JLabel j6=new JLabel("产品：");
        JTextField tf6=new JTextField();
        JLabel j7=new JLabel("价格计量单位");
        JTextField tf7=new JTextField();
        JButton jb=new JButton("生成：");
        jb.setBounds(250, 190, 80, 50);
        JTextArea ta=new JTextArea();
        ta.setLineWrap(true);
        ta.setBounds(40, 260, 500, 200);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String st = tf1.getText()+"最大的"+tf2.getText()+tf3.getText()+"倒闭了，王八蛋老板"+tf4.getText()+"吃喝嫖赌，欠下了"+tf5.getText()+"亿,带着他的小姨子跑了!我们没有办法，拿着"+tf6.getText()+"抵工资!原价都是一"+tf7.getText()+"多、两"+tf7.getText()+"多、三"
                        +tf7.getText()+"多的" +tf6.getText()+ "现在全部只卖二十块，统统只要二十块!"+tf4.getText()+"王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!";
                if(tf1.getText().length()==0||tf2.getText().length()==0||tf3.getText().length()==0||tf4.getText().length()==0||tf5.getText().length()==0||tf6.getText().length()==0||tf7.getText().length()==0){
                    JOptionPane.showMessageDialog(jf,"请输入完整信息");
                    return;
                }try {
                    Integer.parseInt(tf5.getText());
                }catch (NumberFormatException e2){
                    JOptionPane.showMessageDialog(jf,"金额请输入纯数字");
                    tf5.grabFocus();
                    return;
                }
                ta.append(st);
            }
        });
        jp.add(j1);
        jp.add(tf1);
        jp.add(j2);
        jp.add(tf2);
        jp.add(j3);
        jp.add(tf3);
        jp.add(j4);
        jp.add(tf4);
        jp.add(j5);
        jp.add(tf5);
        jp.add(j6);
        jp.add(tf6);
        jp.add(j7);
        jp.add(tf7);
        jf.add(jp);
        jf.add(jb);
        jf.add(ta);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
