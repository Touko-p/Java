package 网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;

public class RobotServer {
    public static void main(String[]args){
        try {
            ServerSocket ss=new ServerSocket(8899);
            Socket s=ss.accept();
            System.out.println("有连接过来" + s);
            InputStream is=s.getInputStream();
            DataInputStream dis=new DataInputStream(is);
            OutputStream os=s.getOutputStream();
            DataOutputStream dos=new DataOutputStream(os);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=android","sa","k2753219155");
            Statement st=c.createStatement();
            while (true){
                String str=dis.readUTF();
                System.out.println(str);
                String sql="select response from Message1 where receive='"+str+"'";
                ResultSet rs=st.executeQuery(sql);
                while (rs.next()){
                    String str1=rs.getString("response");
                    dos.writeUTF(str1);
                }

            }

        }catch (IOException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
