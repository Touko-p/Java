package SwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener{
    private String num1;           //储存第一个要输入的数字
    private String num2;           //储存可能输出的第二个数字
    private String option;        //储存计算器中的运算符号之类的
    private LayoutManager gridbaglayout;   //panel中的布局类型
    private JTextField jtf=new JTextField("0");   //初始化一个文本框来进行以后的操作
    private boolean flag=false;                    //定义一个boolean类型的量来判断以后的文本框

    public  calculator (){         //在calculator这个类里面构造函数来实现面板功能
        JFrame jf=new JFrame("计算器");
        jf.setSize(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jp=new JPanel();        //初始化一个面板
        jp.setLayout(new GridLayout(5,4));

        String dcKey[] = { "CE","C", "←", "÷", "7", "8", "9","×", "4", "5", "6", "-",
                "1","2", "3", "+", "NULL", "0","null", "="};

        for(int i=0;i<dcKey.length;i++){
            JButton b=new JButton(dcKey[i]);
            jp.add(b);
            b.addActionListener(this);
        }
        jf.add(jtf,BorderLayout.NORTH);      //在BorderLayout布局中把文本框放在北方
        jf.add(jp, BorderLayout.CENTER);    //在Borderlayout布局中把面板jp 居中
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String get1=e.getActionCommand();
        if("0123456789".indexOf(get1)!=-1){  //判断这一串数字中是否有一个能在indexof这个函数里面找到   没找到就返回-1 所以这个就是在这个字符串里面找到了
            if(flag){
                String input=jtf.getText();
                jtf.setText(input+get1);
            }else{
                jtf.setText(get1);
                flag=true;
            }
        }
        if("+-×÷".indexOf(get1)!=-1){
            option=jtf.getText();   //num1是用作来储存文本框里面被点击了的运算符号   option储存已经点击完了的数字
            num1=get1;
            flag=false;
        }
        if("=".equals(get1)){       //执行计算的操作
            num2=jtf.getText();      //第二次点击的数字
            double d1=Double.parseDouble(option );
            double d2=Double.parseDouble(num2);
            if("+".equals(num1)){
                d1=d1+d2;
            }else if("×".equals(num1)){
                d1=d1*d2;
            }else if("÷".equals(num1)){
                d1=d1/d2;
            }else if("-".equals(num1)){
                d1=d1-d2;
            }
            num2=d1+"";
            jtf.setText(num2);
            flag=false;
        }
    }
    public static void main(String[] args) {
        new calculator();
    }
}