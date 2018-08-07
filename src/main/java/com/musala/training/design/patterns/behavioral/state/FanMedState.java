package com.musala.training.design.patterns.behavioral.state;

public class FanMedState extends State {

    private Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan to off");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is med.";
    }
}
