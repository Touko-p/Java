package Swing;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JianPanJT {
    public static void main(String[]args){
        JFrame f=new JFrame("键盘监听");
        f.setSize(400, 300);
        f.setLocation(580, 200);
        f.setLayout(null);

        final JLabel l = new JLabel();

        ImageIcon i = new ImageIcon("D:/Swing/Shana1.png");
        l.setIcon(i);
        l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());
        // 增加键盘监听
        f.addKeyListener(new KeyListener() {
            @Override
            // 一个按下弹起的组合动作
            public void keyTyped(KeyEvent e) {

            }
            //键被按下
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==39){
                    // 图片向右移动 （y坐标不变，x坐标增加）
                    l.setLocation(l.getX() + 10, l.getY());
                }
                if(e.getKeyCode()==38){
                    // 图片向上移动 （y坐标减少，x坐标不变）
                    l.setLocation(l.getX() , l.getY()-10);
                }
                if(e.getKeyCode()==40){
                    // 图片向下移动 （y坐标增加，x坐标不变）
                    l.setLocation(l.getX() , l.getY()+10);
                }
                if(e.getKeyCode()==37){
                    // 图片向左移动 （y坐标不变，x坐标减少）
                    l.setLocation(l.getX() - 10, l.getY());
                }

            }
            // 键被弹起
            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
