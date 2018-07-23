package design.patterns.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SingletonDemo {
    public static void main(String args[]) {
        Singleton instance = Singleton.getInstance();

        Connection conn = instance.getConnection();

        Statement sta;
        try {
            sta = conn.createStatement();
            int count = sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
            System.out.println("Table created");
            sta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
