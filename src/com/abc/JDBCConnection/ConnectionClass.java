/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author test
*/ 
public class ConnectionClass {
<<<<<<< HEAD

   

    public static Connection getConnected() throws ClassNotFoundException, SQLException{


=======
    public static Connection getConnected() throws ClassNotFoundException, SQLException{


<<<<<<< HEAD
=======
    //static public Connection getConnected() throws ClassNotFoundException, SQLException{
>>>>>>> b7837663e864833e0879d3f6246305d3c628fe2f
>>>>>>> ee9ff5c01bedc551aa276443bbc3c429c052b0aa
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
