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
>>>>>>> 5d0a572303d4837852c9f23f49469dc632baf48e
public class ConnectionClass {
 

    public static Connection getConnected() throws ClassNotFoundException, SQLException{
<<<<<<< HEAD

 

    //public static Connection getConnected() throws ClassNotFoundException, SQLException{

    //static public Connection getConnected() throws ClassNotFoundException, SQLException{

    //static public Connection getConnected() throws ClassNotFoundException, SQLException{

   



    //public static Connection getConnected() throws ClassNotFoundException, SQLException{
 
 
        Class.forName("oracle.jdbc.driver.OracleDriver");
 
 

    
  
=======
    Class.forName("oracle.jdbc.driver.OracleDriver");
        Class.forName("oracle.jdbc.driver.OracleDriver");
>>>>>>> 5d0a572303d4837852c9f23f49469dc632baf48e
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
