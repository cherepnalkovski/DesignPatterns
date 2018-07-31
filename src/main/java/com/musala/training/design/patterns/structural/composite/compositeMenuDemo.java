package com.musala.training.design.patterns.structural.composite;

public class compositeMenuDemo {

    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safety" , "/safety");

        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");

        mainMenu.add(claimsSubMenu);

        MenuItem personalCalimsMenu = new MenuItem("Personal Claim" , "/personalClaims");

        mainMenu.add(personalCalimsMenu);

        System.out.println(mainMenu.toString());
    }

}
