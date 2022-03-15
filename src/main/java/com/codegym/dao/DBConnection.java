package com.codegym.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static final String JDBC_MYSQL_LOCALHOST = "jdbc:mysql://localhost:3306/product_management";
    public static final String ROOT = "root";
    public static final String PASSWORD = "12345678";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection(JDBC_MYSQL_LOCALHOST, ROOT, PASSWORD);
        return connection;
    }
}
