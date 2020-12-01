package Chat;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class GuiClient {
    public static void main(String[]args)throws Exception{
        JFrame f=new JFrame("Client");
        f.setBounds(200,200,400,300);
        f.setLayout(null);
        JButton button=new JButton("SEND");
        button.setBounds(280,200,70,30);
        f.add(button);
        JTextField textField=new JTextField();
        textField.setBounds(50,200,200,30);
        f.add(textField);
        JTextArea textArea=new JTextArea();
        textArea.setBounds(50,20,300,150);
        f.add(textArea);
        Socket s=new Socket("127.0.0.1", 9999);
        new Thread(){
            public void run(){
                while (true){
                    try {
                        DataInputStream dis=new DataInputStream(s.getInputStream());
                        String text=dis.readUTF();
                        textArea.append("服务端的消息："+text+"\r\n");
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=textField.getText();
                textArea.append(text+"\r\n");
                try {
                    DataOutputStream dos=new DataOutputStream(s.getOutputStream());
                    dos.writeUTF(text);
                }catch (IOException e1){
                    e1.printStackTrace();
                }
                textField.setText("");
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
