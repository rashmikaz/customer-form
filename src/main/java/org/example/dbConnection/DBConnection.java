package org.example.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbconnection;

    private Connection connection;

    private DBConnection() throws SQLException {
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kade","root","mysql1229");
    }
    public static DBConnection getInstance() throws SQLException {
        if(dbconnection==null) {
            dbconnection = new DBConnection();
            return dbconnection;
        }else{
            return dbconnection;
        }

    }
    public Connection getConnection(){
        return connection;

    }
}
