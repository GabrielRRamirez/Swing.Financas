/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class connection {

    public static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("database");
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new dbException(e.getMessage());

            }

        }
        return conn;
    }

    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("banco.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new dbException(e.getMessage());
        }
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                conn = null;

            } catch (SQLException e) {
                throw new dbException(e.getMessage());
            }
        }
    }
    
    public static void closeResultset(ResultSet rs){
        try{
            if(rs != null){
                rs.close();
            }
        }catch(SQLException e){
            throw new dbException(e.getMessage());
            
        }
    }
    
    public static void closeStatement(Statement st){
        try{
            if(st != null){
                st.close();
            }
            
        }catch(SQLException e){
            throw new dbException(e.getMessage());
        }
    }
}
