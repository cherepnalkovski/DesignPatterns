package com.musala.training.design.patterns.behavioral.command.receiver;

//Receiver
public class Light extends Device{

    @Override
    public void on() {
        System.out.println("Light switched on.");
    }

    @Override
    public void off() {
        System.out.println("Light switched off.");
    }
}
