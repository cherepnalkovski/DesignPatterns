package com.musala.training.design.patterns.behavioral.command.receiver;

public abstract class Device {

    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if(isOn) {
            off();
            isOn = false;
        }
        else {
            on();
            isOn = true;
        }
    }

    public abstract void on();

    public abstract  void off();
}
