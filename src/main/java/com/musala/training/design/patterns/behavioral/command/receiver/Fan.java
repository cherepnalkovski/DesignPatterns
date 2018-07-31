package com.musala.training.design.patterns.behavioral.command.receiver;

public class Fan extends Device{

    @Override
    public void on() {
        System.out.println("Fan switched on.");
    }

    @Override
    public void off() {
        System.out.println("Fan switched off.");
    }
}
