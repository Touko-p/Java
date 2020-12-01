package Chat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class GuiServer {
    public static void main(String[]args)throws Exception{
        JFrame f=new JFrame("Server");
        f.setBounds(200,200,400,300);
        f.setLayout(null);
        JButton jb=new JButton("SEND");
        jb.setBounds(280,200,70,30);
        f.add(jb);
        JTextField jf=new JTextField();
        jf.setBounds(50,200,200,30);
        f.add(jf);
        JTextArea ta=new JTextArea();
        ta.setBounds(50,20,300,150);
        f.add(ta);
        ServerSocket ss=new ServerSocket(9999);
        Socket s=ss.accept();
        new Thread() {
            public void run(){
                while (true){
                    try {
                        DataInputStream dis=new DataInputStream(s.getInputStream());
                        String str=dis.readUTF();
                        ta.append("客户端的消息："+str+"\r\n");
                    }catch (IOException e){
                        e.printStackTrace();
                    }

                }
            }
        }.start();
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=jf.getText();
                ta.append(str+"\r\n");
                try {
                    DataOutputStream dos=new DataOutputStream(s.getOutputStream());
                    dos.writeUTF(str);
                }catch (IOException e1){
                    e1.printStackTrace();
                }
                jf.setText("");
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
