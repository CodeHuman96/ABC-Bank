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
<<<<<<< HEAD
=======

>>>>>>> 8b9114c93791fc8e883336e2c2841bba48075fe4
import java.sql.*;

/**
 *
 * @author test
*/ 

<<<<<<< HEAD
 
import java.sql.*;
=======

 
import java.sql.*;
 
>>>>>>> 8b9114c93791fc8e883336e2c2841bba48075fe4

=======
<<<<<<< HEAD
 
 
import java.sql.*;
 
 
>>>>>>> c1853145b443a7e88355c8f6b396b193815fa3f2
public class ConnectionClass {
 

    public static Connection getConnected() throws ClassNotFoundException, SQLException{
<<<<<<< HEAD


=======
>>>>>>> c1853145b443a7e88355c8f6b396b193815fa3f2
 
<<<<<<< HEAD
=======
 
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
>>>>>>> c1853145b443a7e88355c8f6b396b193815fa3f2
 
<<<<<<< HEAD
 
        //Class.forName("oracle.jdbc.driver.OracleDriver");
 
 

    
  

    Class.forName("oracle.jdbc.driver.OracleDriver");
        Class.forName("oracle.jdbc.driver.OracleDriver");

=======
  
        Class.forName("oracle.jdbc.driver.OracleDriver");
<<<<<<< HEAD
=======
 
=======
        Class.forName("oracle.jdbc.driver.OracleDriver");

>>>>>>> 7fe0b6dff669cab9b2c03e72f6a9870a937a1acb
>>>>>>> c1853145b443a7e88355c8f6b396b193815fa3f2
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
