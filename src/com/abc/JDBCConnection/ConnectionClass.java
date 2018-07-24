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

=======
>>>>>>> d4d54e41ef0f1e33b276ef4d564e9d64d0ac873d
/**
 *
 * @author test
*/ 
public class ConnectionClass {
<<<<<<< HEAD
    public static Connection getConnected() throws ClassNotFoundException, SQLException{
    //public static Connection getConnected() throws ClassNotFoundException, SQLException{

    Class.forName("oracle.jdbc.driver.OracleDriver");

=======
<<<<<<< HEAD

 
    public static Connection getConnected() throws ClassNotFoundException, SQLException{




 

     

    //public static Connection getConnected() throws ClassNotFoundException, SQLException{



    //public static Connection getConnected() throws ClassNotFoundException, SQLException{




    //static public Connection getConnected() throws ClassNotFoundException, SQLException{
    //static public Connection getConnected() throws ClassNotFoundException, SQLException{


 
 


    //static public Connection getConnected() throws ClassNotFoundException, SQLException{



=======
    public static Connection getConnected() throws ClassNotFoundException, SQLException{

>>>>>>> c0b0aa2e1ac8ea88ef5428e69625cc632a23583f
>>>>>>> d4d54e41ef0f1e33b276ef4d564e9d64d0ac873d
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
