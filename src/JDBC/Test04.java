package JDBC;

import java.sql.*;

public class Test04 {
    public static void main(String[]args){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=学生","sa","k2753219155");
            Statement s=c.createStatement();
            String name="yaso";
            String psw="275321";
            String sql="select * from Message where Name ='"+name+"'and Psw='"+psw+"'";
            ResultSet rs=s.executeQuery(sql);
            if(rs.next())
                System.out.println("密码正确");
            else
                System.out.println("密码错误");

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
