/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author test
 
public class ConnectionClass {
    public Connection getConnected() throws ClassNotFoundException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connect=DriverManager.getConnection(url);
        return connect;
    }
}
*/