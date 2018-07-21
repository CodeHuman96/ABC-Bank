/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author test
*/ 
public class ConnectionClass {
<<<<<<< HEAD
    public static Connection getConnected() throws ClassNotFoundException, SQLException{
=======
    static public Connection getConnected() throws ClassNotFoundException, SQLException{
>>>>>>> a6d86d90e2ee7f0a7b8a4b125d1c7f145347b16c
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
