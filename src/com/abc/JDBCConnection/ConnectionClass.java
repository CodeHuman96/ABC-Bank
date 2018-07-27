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
 
 
public class ConnectionClass {
 

    public static Connection getConnected() throws ClassNotFoundException, SQLException{
 
 
=======

import java.sql.*;
>>>>>>> 7fe0b6dff669cab9b2c03e72f6a9870a937a1acb

/**
 *
 * @author test
*/ 

import java.sql.*;

public class ConnectionClass {
 

    public static Connection getConnected() throws ClassNotFoundException, SQLException{



<<<<<<< HEAD
    //public static Connection getConnected() throws ClassNotFoundException, SQLException{
 
  
        Class.forName("oracle.jdbc.driver.OracleDriver");
 
=======
        Class.forName("oracle.jdbc.driver.OracleDriver");

>>>>>>> 7fe0b6dff669cab9b2c03e72f6a9870a937a1acb
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
