package com.musala.training.design.patterns.structural.decorator;

public class DecoratorSandwichDemo {
    public static void main(String[] args) {
        Sandwich sandwich = new MeatDecorator(new DressingDecorator((new MeatDecorator(new SimpleSandwich()))));
        Sandwich sandwich1 = new MeatDecorator(new DressingDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
        System.out.println(sandwich1.make());
    }
}
