package jm.task.core.jdbc.util;


import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {

    private final static String URL = "jdbc:mysql://localhost:3306/mydb";
    private final static String USER = "Crisally";
    private final static String PASSWORD = "456852";
    private static SessionFactory sessionFactory;

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Connection error");

        }

        return conn;
    }

}