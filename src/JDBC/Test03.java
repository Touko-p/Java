package JDBC;

import java.sql.*;

public class Test03 {
    public static void main(String[]args){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=学生成绩管理系统","sa","k2753219155");
            Statement s=c.createStatement();
            String sql="select * from Course";
            ResultSet rs=s.executeQuery(sql);
            while (rs.next()){
                String Cno=rs.getString("Cno");
                String Cname=rs.getString("Cname");
                float Credit=rs.getFloat("Credit");
                int ClassHour=rs.getInt("ClassHour");
                System.out.println(Cno+"\t"+Cname+"\t"+Credit+"\t"+ClassHour);
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
