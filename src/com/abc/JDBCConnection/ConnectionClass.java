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

public class ConnectionClass {

    public static Connection getConnected() throws ClassNotFoundException, SQLException{
<<<<<<< HEAD
  
 
        Class.forName("oracle.jdbc.driver.OracleDriver");

 
=======

>>>>>>> cde57a799c89dcf452d2ce892ce4579b202faa0b
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
