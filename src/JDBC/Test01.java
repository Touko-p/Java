package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01 {
    public static void main(String[]args){
        Connection c = null;
        Statement s = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("数据库驱动加载完毕");
            c= DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=学生","sa","k2753219155");
            System.out.println("连接成功，获取连接对象"+c);
            s=c.createStatement();
            System.out.println("获取Statement对象"+s);
            for(int i=0;i<100;i++){
                int id=15+i;
                String name="英雄"+i;
                String password="12345"+i;
                String sql="insert into Student values("+id+",'"+name+"','"+password+"')";
                s.execute(sql);
            }
        }
        catch (ClassNotFoundException e){

        }
        catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(s!=null)
                try {
                    s.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            if(c!=null)
                try {
                    c.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
        }
    }
}
