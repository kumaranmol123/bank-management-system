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
            String dbUrl = "jdbc:mysql://localhost:3306/Bank_Management";         
            String dbUser = "root";       
            String dbPassword ="Leet79leet@" ; 
            
            return DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("Database Connection Failed!");
        }
    }
}