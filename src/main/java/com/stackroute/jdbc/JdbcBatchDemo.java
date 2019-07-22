
package com.stackroute.jdbc;
import  java.sql.*;
public  class JdbcBatchDemo
    {

    public static void main(String args[])throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "Root@123");
        con.setAutoCommit(false);

        Statement stmt=con.createStatement();
        stmt.addBatch("insert into Employee values(17,'abhi',40,'Male')");
        stmt.addBatch("insert into Employee values(19,'umesh',50,'Male')");

        stmt.executeBatch();//executing the batch

        con.commit();
        con.close();
        }}