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

 
    public static Connection getConnected() throws ClassNotFoundException, SQLException{
 
=======
<<<<<<< HEAD


    





    //public static Connection getConnected() throws ClassNotFoundException, SQLException{





    public static Connection getConnected() throws ClassNotFoundException, SQLException{


   

<<<<<<< HEAD
=======
=======
>>>>>>> a7577587c322bdfe5a4dc3bf86cec7342b5e73ef
>>>>>>> 36210174edb83c4fad7ffe31ca4e7b2487a396e3


<<<<<<< HEAD
   

=======
<<<<<<< HEAD
 
=======
>>>>>>> c626444df48cd7b4de0b48f23c2fd7832c03b48c
>>>>>>> 36210174edb83c4fad7ffe31ca4e7b2487a396e3
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
