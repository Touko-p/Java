package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test02 {
    public static void execute(String sql){
        Connection c=null;
        Statement s=null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=学生","sa","k2753219155");
            s=c.createStatement();
            s.execute(sql);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        String in="insert into Student values(116,'剑圣','js001')";
        String de="delete from Student where name='yaso' ";
        String ch="update Student set password='ksdfa' where name='Touko'";
        /*execute(in);
        execute(de);*/
        execute(ch);

    }

}
