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

    //static public Connection getConnected() throws ClassNotFoundException, SQLException{


=======
<<<<<<< HEAD

=======
<<<<<<< HEAD
    //static public Connection getConnected() throws ClassNotFoundException, SQLException{

=======
>>>>>>> 13da32746c3388ec10be51590045b725c719ac41
>>>>>>> 970533739c5964e65099d406c61e1ddaf7ac0534
>>>>>>> 5cea15a63ededb9943a5a8b289da7e1062c26cce
>>>>>>> 3afdf20c8dddd5cce980fcca41092f1d878960d4
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
