package Swing;

import javax.swing.*;

public class CaiDan {
    public static void main(String[]args){
        JFrame f=new JFrame("记事本");
        f.setSize(400, 400);
        f.setLocation(200, 200);
        JMenuBar mb=new JMenuBar();
        JMenu m=new JMenu("新建（F）");
        JMenu m1=new JMenu("编辑（E）");
        JMenu m2=new JMenu("格式（O）");
        JMenu m3=new JMenu("查看（V）");
        JMenu m4=new JMenu("帮助（H）");
        m.add(new JMenuItem("新建（N）    Ctrl+N"));
        m.add(new JMenuItem("打开（O）    Ctrl+O"));
        m.add(new JMenuItem("保存（S）    Ctrl+S"));
        m.add(new JMenuItem("另存为（N）..."));
        m.addSeparator();
        m.add(new JMenuItem("页面设置（U)..."));
        m.add(new JMenuItem("打印（P)...  Crtl+P"));
        m.addSeparator();
        m.add(new JMenuItem("退出（X）"));
        mb.add(m);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        f.setJMenuBar(mb);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
