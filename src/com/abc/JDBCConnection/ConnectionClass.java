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
=======
<<<<<<< HEAD

import java.sql.*;

=======
import java.sql.*;

<<<<<<< HEAD
=======

>>>>>>> d1609686539caf6b7fc11a70dbf3102fa9a58ccd
>>>>>>> 275a9f4ff93b10dd390a040016d3cb5474df1612
>>>>>>> b043601c21e4d6d23b26e472b6b1c89d55ff4f29
>>>>>>> 28d1ff515be202d5cdfd48c7d543b6dfe8bd0987
/**
 *
 * @author test
*/ 
public class ConnectionClass {
<<<<<<< HEAD
=======

<<<<<<< HEAD
    public static Connection getConnected() throws ClassNotFoundException, SQLException{

    //public static Connection getConnected() throws ClassNotFoundException, SQLException{

    //static public Connection getConnected() throws ClassNotFoundException, SQLException{

    //static public Connection getConnected() throws ClassNotFoundException, SQLException{
=======
=======
<<<<<<< HEAD
    public static Connection getConnected() throws ClassNotFoundException, SQLException{
>>>>>>> 275a9f4ff93b10dd390a040016d3cb5474df1612

>>>>>>> 28d1ff515be202d5cdfd48c7d543b6dfe8bd0987
    public static Connection getConnected() throws ClassNotFoundException, SQLException{

    //static public Connection getConnected() throws ClassNotFoundException, SQLException{
    Class.forName("oracle.jdbc.driver.OracleDriver");
<<<<<<< HEAD
=======
>>>>>>> d1609686539caf6b7fc11a70dbf3102fa9a58ccd

>>>>>>> 275a9f4ff93b10dd390a040016d3cb5474df1612
>>>>>>> b043601c21e4d6d23b26e472b6b1c89d55ff4f29
>>>>>>> 28d1ff515be202d5cdfd48c7d543b6dfe8bd0987
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
