package com.musala.training.design.patterns.structural.flyweight;

public class flyweightDemo {



    public static void main(String[] args) {
        InventorySystem ims = new InventorySystem();

        ims.takeOrder("Roomba", 221);
        ims.takeOrder("Samsung TV", 361);
        ims.takeOrder("Roomba", 225);
        ims.takeOrder("Samsung TV", 400);
        ims.takeOrder("Bose HeadPhones", 355);
        ims.takeOrder("Bose HeadPhones", 800);
        ims.takeOrder("Roomba", 700);

        ims.process();

        System.out.println(ims.report());

    }
}
