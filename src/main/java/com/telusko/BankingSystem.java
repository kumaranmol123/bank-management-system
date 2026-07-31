package com.telusko;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class BankingSystem{
    public static Connection getconnection() throws SQLException {
    	try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 💡 Pull credentials securely from the operating system environment
            String url = System.getenv("DB_URL");
            String username = System.getenv("DB_USERNAME");
            String password = System.getenv("DB_PASSWORD");
            
            return DriverManager.getConnection(Url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("Database Connection Failed!");
        }
    }
}
