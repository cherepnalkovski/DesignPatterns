package com.musala.training.design.patterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class FacadeGoodDemo {
    public static void main(String[] args) {

        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();
        System.out.println("Table created");

        jdbcFacade.insertIntoTable();
        System.out.println("Record Inserted");

        List<Address> addresses;
        addresses = jdbcFacade.getAddresses();

        System.out.println("Addresses: ");
        addresses.stream().forEach(x -> System.out.println(x.getId() + " " + x.getCity() + " " + x.getStreetName()));
    }
}
