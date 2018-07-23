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

=======
import java.sql.*;
>>>>>>> c00ca001d943a6cfc73b7b46f5fadc21d2f006df
/**
 *
 * @author test
*/ 
public class ConnectionClass {
<<<<<<< HEAD

=======
    public static Connection getConnected() throws ClassNotFoundException, SQLException{
<<<<<<< HEAD
>>>>>>> 19df997d584a8eb055aa7b241c2c286878518acf


    //public static Connection getConnected() throws ClassNotFoundException, SQLException{


<<<<<<< HEAD

=======

    //static public Connection getConnected() throws ClassNotFoundException, SQLException{


<<<<<<< HEAD
=======

    //static public Connection getConnected() throws ClassNotFoundException, SQLException{


=======
>>>>>>> a0dfef91cc2111fee7e3a35291ee7a7f2ea1782c
>>>>>>> 79ca06886f5a3e3e160fee89d0d7359bce8b4ec4
>>>>>>> 19df997d584a8eb055aa7b241c2c286878518acf
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
