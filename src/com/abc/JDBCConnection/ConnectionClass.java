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

=======

import java.sql.*;


<<<<<<< HEAD
public class ConnectionClass {

    public static Connection getConnected() throws ClassNotFoundException, SQLException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
=======
>>>>>>> 0f0e7702fc368289effa846ae9de9c656597b3aa
/**
>>>>>>> e6bdaf3f10cb98b80d0ff2226124f009780be87f
 *
 * @author test
*/ 
public class ConnectionClass {

    public static Connection getConnected() throws ClassNotFoundException, SQLException{

<<<<<<< HEAD

    //public static Connection getConnected() throws ClassNotFoundException, SQLException{

    //static public Connection getConnected() throws ClassNotFoundException, SQLException{

    //static public Connection getConnected() throws ClassNotFoundException, SQLException{

   



    //public static Connection getConnected() throws ClassNotFoundException, SQLException{
=======
>>>>>>> 0f0e7702fc368289effa846ae9de9c656597b3aa




  
<<<<<<< HEAD
    
        Class.forName("oracle.jdbc.driver.OracleDriver");
=======
    Class.forName("oracle.jdbc.driver.OracleDriver");


>>>>>>> 0f0e7702fc368289effa846ae9de9c656597b3aa
>>>>>>> dd57fb49b7d9a417fdc100d8e64e33c627e7b7b1
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
