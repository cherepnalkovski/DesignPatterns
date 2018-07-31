package com.musala.training.design.patterns.structural.facade;

import com.musala.training.design.patterns.creational.singleton.Singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    Singleton instance;
    Connection conn;

    public JdbcFacade() {
        instance = Singleton.getInstance();
        conn = instance.getConnection();
    }

    public int createTable() {
        int count = 0;
        try {
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");
            sta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("INSERT INTO Address (ID, StreetName, City) values (1, 'Some street', 'Layton')");
            sta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getAddresses() {
        List<Address> addresses = new ArrayList<>();
        try {
            Statement sta = conn.createStatement();
            ResultSet rs = sta.executeQuery("SELECT * FROM Address");

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
                Address address = new Address();
                address.setId(Integer.parseInt(rs.getString(1)));
                address.setStreetName(rs.getString(2));
                address.setCity(rs.getString(3));
                addresses.add(address);
            }

            rs.close();
            sta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return addresses;

    }
}
