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
 
<<<<<<< HEAD
=======



    


>>>>>>> c8a67a3aaa7ba1d8a3fd02629830d1f7a77281cf






<<<<<<< HEAD
    
=======


    //public static Connection getConnected() throws ClassNotFoundException, SQLException{


   


        Class.forName("oracle.jdbc.driver.OracleDriver");

>>>>>>> c8a67a3aaa7ba1d8a3fd02629830d1f7a77281cf
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
