package com.musala.training.design.patterns.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Example of singleton pattern;
 * - static in nature
 * - private constructor
 * - static methot witch returns static instance.
 */
public class Singleton {

    private static volatile Singleton instance = null;
    private static volatile Connection conn = null;

    private Singleton() {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(conn != null) {

        }
    }


    public static Singleton getInstance() {
        //Lazy loading
        if(instance == null) {
            //used for multi threading
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        if(conn == null) {
            synchronized (Singleton.class) {
                if(conn == null) {
                    String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                    try {
                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }
}
