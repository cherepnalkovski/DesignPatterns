package com.musala.training.design.patterns.creational.builder;

public class Person {

    public static class Builder {
        private String name;
        private String surname;
        private String address;
        private int age;

        public Builder() {
        }

        public Person build() {
            return  new Person(this);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }
    }

    private final String name;
    private final String surname;
    private final String address;
    private final int age;

    public Person(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.address = builder.address;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }

}
