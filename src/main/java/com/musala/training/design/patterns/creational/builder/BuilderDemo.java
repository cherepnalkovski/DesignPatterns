package com.musala.training.design.patterns.creational.builder;

public class BuilderDemo {

    public static void main(String argsp[]) {
        Person.Builder builder = new Person.Builder();
        builder.name("Vladimir").surname("Cherepnalkovsko").age(29);

        Person vladimir = builder.build();

        System.out.println("Ime :" + vladimir.getName());
        System.out.println("Prezime :" + vladimir.getSurname());
        System.out.println("Godini :" + vladimir.getAge());
    }
}
