package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcTransactionDemo {
    public static void main(String args[])throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "Root@123");
        con.setAutoCommit(false);

        Statement stmt=con.createStatement();
        stmt.addBatch("insert into Employee values(40,'Varid',22,'Male')");
        stmt.addBatch("insert into Employee values(14,'sabya',22,'Male')");

        stmt.executeBatch();//executing the batch
        System.out.println("Do you want to commit or rollback");
        Scanner scanner=new Scanner(System.in);
        if(scanner.next().equals("commit"))
        con.commit();
        else
            con.rollback();
        con.close();
    }
}
