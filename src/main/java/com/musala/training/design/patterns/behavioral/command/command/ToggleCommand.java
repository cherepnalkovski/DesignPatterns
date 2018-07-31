package com.musala.training.design.patterns.behavioral.command.command;

import com.musala.training.design.patterns.behavioral.command.receiver.Light;

//Concrete command
public class ToggleCommand implements Command {

    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
