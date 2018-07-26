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
<<<<<<< HEAD

 


import java.sql.*;


 
>>>>>>> 665a14747af00109f9e8fb2ef7f789c48938f9ec
/**
 *
 * @author test
*/ 
public class ConnectionClass {
<<<<<<< HEAD

    public static Connection getConnected() throws ClassNotFoundException, SQLException{
 
        Class.forName("oracle.jdbc.driver.OracleDriver");
=======
 

 
    
 
=======
public class ConnectionClass {

    public static Connection getConnected() throws ClassNotFoundException, SQLException{
<<<<<<< HEAD
=======
>>>>>>> e9e0259cadebfd766cd1b2045ef65ee34dfe50b3
 


    



    
>>>>>>> 2d5215e2f19475140dad041e3b5a7408b2019642

<<<<<<< HEAD

    //public static Connection getConnected() throws ClassNotFoundException, SQLException{





    public static Connection getConnected() throws ClassNotFoundException, SQLException{


   

 
        Class.forName("oracle.jdbc.driver.OracleDriver");
=======
>>>>>>> e9e0259cadebfd766cd1b2045ef65ee34dfe50b3
>>>>>>> 665a14747af00109f9e8fb2ef7f789c48938f9ec
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
