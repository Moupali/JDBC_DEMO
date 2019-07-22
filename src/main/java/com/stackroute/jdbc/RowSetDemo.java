package com.stackroute.jdbc;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.*;
import com.sun.rowset.JdbcRowSetImpl;

public class RowSetDemo
{

    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "Root@123");
        JdbcRowSet rowSet =  new JdbcRowSetImpl(connection);
        rowSet.setUsername("root");
        rowSet.setPassword("Root@123");

        rowSet.setCommand("select * from Employee");
        rowSet.execute();


        while (rowSet.next()) {

            System.out.println("Id: " + rowSet.getInt(1));
            System.out.println("Name: " + rowSet.getString(2));
            System.out.println("Age: " + rowSet.getInt(3));
        }

    }

}