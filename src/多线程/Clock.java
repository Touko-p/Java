package 多线程;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends JFrame {
    private JLabel label;

    public Clock() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        JPanel panel = new JPanel(new BorderLayout());
        getContentPane().add(panel);
        panel.setPreferredSize(new Dimension(200, 100));
        pack();
        setLocationRelativeTo(null);
        label = new JLabel("测试文字", JLabel.CENTER);
        panel.add(label, BorderLayout.CENTER);
        label.setPreferredSize(new Dimension(200, 100));
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true);
        label.setForeground(Color.cyan);
        label.setFont(new Font(getFont().getName(), Font.BOLD, 28));

    }

    public void start() {
        while (true) {
            final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            label.setText(sdf.format(new Date()));
            setVisible(true);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
        public static void main (String[]args){
            Clock clock = new Clock();
            clock.start();
        }


}
