package Swing;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class ShuBiaoJT {
    public static void main(String[]args){
        JFrame f=new JFrame("鼠标监听");
        f.setSize(800,600);
        f.setLayout(null);
        final JLabel l = new JLabel();
        ImageIcon i = new ImageIcon("D:/Swing/Shana1.png");
        l.setIcon(i);
        l.setBounds(375, 275, i.getIconWidth(), i.getIconHeight());
        l.addMouseListener(new MouseListener() {
            @Override
            // 按下释放组合动作为点击鼠标
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            // 按下鼠标
            public void mousePressed(MouseEvent e) {

            }

            @Override
            // 释放鼠标
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            // 鼠标进入
            public void mouseEntered(MouseEvent e) {
                Random r=new Random();
                int x = r.nextInt(f.getWidth() - l.getWidth());
                int y = r.nextInt(f.getHeight() - l.getHeight());
                l.setLocation(x, y);
            }

            @Override
            // 鼠标退出
            public void mouseExited(MouseEvent e) {

            }
        });
        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
