/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*
=======
<<<<<<< HEAD
 
=======
>>>>>>> c3a9d6b728f7a36c6a32d3f8c6b470be5158f1b4

>>>>>>> 0f0e7702fc368289effa846ae9de9c656597b3aa
/**
>>>>>>> e6bdaf3f10cb98b80d0ff2226124f009780be87f
 *
 * @author test
*/ 
public class ConnectionClass {

    public static Connection getConnected() throws ClassNotFoundException, SQLException{






  

    Class.forName("oracle.jdbc.driver.OracleDriver");



        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
