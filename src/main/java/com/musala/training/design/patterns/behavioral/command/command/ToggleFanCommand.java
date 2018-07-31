package com.musala.training.design.patterns.behavioral.command.command;

import com.musala.training.design.patterns.behavioral.command.receiver.Fan;

public class ToggleFanCommand implements Command {

    private Fan fan;

    public ToggleFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.toggle();
    }
}
