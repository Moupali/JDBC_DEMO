package com.stackroute.jdbc;

import java.sql.*;

public class ResultSetMetadataDemo
{
    public void resultSet()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "Root@123");
            ;
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from Employee");
            ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
            System.out.println(" Returns the number of columns in this <code>ResultSet</code> object.");
            System.out.println(resultSetMetaData.getColumnCount());
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }

}
