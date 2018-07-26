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
 
/**
 *
 * @author test
*/ 
=======

<<<<<<< HEAD
=======
import java.sql.*;
>>>>>>> 1dd16c036c2e3c84abc231a99f49df69eaae53a6

>>>>>>> b1a53fab642cb0498456be953d0951a772b80d04
public class ConnectionClass {
 

    public static Connection getConnected() throws ClassNotFoundException, SQLException{

<<<<<<< HEAD

    //public static Connection getConnected() throws ClassNotFoundException, SQLException{

    //static public Connection getConnected() throws ClassNotFoundException, SQLException{

    //static public Connection getConnected() throws ClassNotFoundException, SQLException{

   



    //public static Connection getConnected() throws ClassNotFoundException, SQLException{
 
 
        Class.forName("oracle.jdbc.driver.OracleDriver");
 
 

    
=======
<<<<<<< HEAD





  

    Class.forName("oracle.jdbc.driver.OracleDriver");



=======
    Class.forName("oracle.jdbc.driver.OracleDriver");

>>>>>>> 1dd16c036c2e3c84abc231a99f49df69eaae53a6
>>>>>>> b1a53fab642cb0498456be953d0951a772b80d04
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
