package controller;

import java.sql.*;
import javax.swing.JOptionPane;

public class my_sql_connector {
    public Connection connection(){
        Connection con = null;        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
        } catch (ClassNotFoundException|SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Connection fail");
        }
        return con;
    }
}
