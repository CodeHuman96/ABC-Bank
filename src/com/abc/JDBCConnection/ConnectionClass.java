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
>>>>>>> c626444df48cd7b4de0b48f23c2fd7832c03b48c
/**
 *
 * @author test
*/ 
public class ConnectionClass {
<<<<<<< HEAD

 
    public static Connection getConnected() throws ClassNotFoundException, SQLException{
 
=======
<<<<<<< HEAD


    





    //public static Connection getConnected() throws ClassNotFoundException, SQLException{





    public static Connection getConnected() throws ClassNotFoundException, SQLException{


   

=======
>>>>>>> a7577587c322bdfe5a4dc3bf86cec7342b5e73ef

    public static Connection getConnected() throws ClassNotFoundException, SQLException{
    //public static Connection getConnected() throws ClassNotFoundException, SQLException{

<<<<<<< HEAD
 
=======
>>>>>>> c626444df48cd7b4de0b48f23c2fd7832c03b48c
        Class.forName("oracle.jdbc.driver.OracleDriver");
>>>>>>> a7577587c322bdfe5a4dc3bf86cec7342b5e73ef
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
