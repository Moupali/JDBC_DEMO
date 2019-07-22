package com.stackroute.jdbc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
        System.out.println("Employee Details");
        simpleJdbcDemo.getEmployeeDetails();
        System.out.println();
        System.out.println("Employee Details in reverse order");
        simpleJdbcDemo.getEmployeeDetailsInReverse();
        System.out.println();
        System.out.println("Second row Reverse");
        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
        System.out.println();
        simpleJdbcDemo.getEmployeeDetailsByNameAndGender("Moupali","Female");

        //DatabaseMeatDataDemo
        System.out.println("-------Database Meta Data------"); DatabaseMetadataDemo databaseMetadataDemo=new DatabaseMetadataDemo();
        databaseMetadataDemo.metaData();
        System.out.println();

        //JdbcBatchDemo
        System.out.println("-----------Batch processing--------");
        JdbcBatchDemo jdbcBatchDemo=new JdbcBatchDemo();
        System.out.println();

        //JdbcTransactionDemo
        System.out.println("------------Transaction------------");
        JdbcTransactionDemo jdbcTransactionDemo=new JdbcTransactionDemo();
        System.out.println();

        //ResultSetMetadataDemo
        System.out.println("------------ResultSet---------------");
        ResultSetMetadataDemo resultSetMetadataDemo=new ResultSetMetadataDemo();
        resultSetMetadataDemo.resultSet();
        System.out.println();

        //RowSetDemo
        System.out.println("-------------Row Set deMO------------");
        RowSetDemo rowSetDemo=new RowSetDemo();
        System.out.println();



    }
}
