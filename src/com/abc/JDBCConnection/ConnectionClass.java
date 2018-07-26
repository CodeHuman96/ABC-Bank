/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
<<<<<<< HEAD

import java.sql.*;

/*
=======
<<<<<<< HEAD
 
=======
>>>>>>> c3a9d6b728f7a36c6a32d3f8c6b470be5158f1b4

/**
>>>>>>> e6bdaf3f10cb98b80d0ff2226124f009780be87f
 *
 * @author test
*/ 
public class ConnectionClass {
<<<<<<< HEAD
 

 
    
 
 


=======

    public static Connection getConnected() throws ClassNotFoundException, SQLException{
<<<<<<< HEAD
        Class.forName("oracle.jdbc.driver.OracleDriver");
=======

<<<<<<< HEAD
=======

    //public static Connection getConnected() throws ClassNotFoundException, SQLException{

    //static public Connection getConnected() throws ClassNotFoundException, SQLException{

    //static public Connection getConnected() throws ClassNotFoundException, SQLException{

   



    //public static Connection getConnected() throws ClassNotFoundException, SQLException{
>>>>>>> c3a9d6b728f7a36c6a32d3f8c6b470be5158f1b4




  
    Class.forName("oracle.jdbc.driver.OracleDriver");

<<<<<<< HEAD
=======
<<<<<<< HEAD
 
        Class.forName("oracle.jdbc.driver.OracleDriver");
 
>>>>>>> e6bdaf3f10cb98b80d0ff2226124f009780be87f
        Class.forName("oracle.jdbc.driver.OracleDriver");
=======
>>>>>>> e6bdaf3f10cb98b80d0ff2226124f009780be87f
>>>>>>> c3a9d6b728f7a36c6a32d3f8c6b470be5158f1b4
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
