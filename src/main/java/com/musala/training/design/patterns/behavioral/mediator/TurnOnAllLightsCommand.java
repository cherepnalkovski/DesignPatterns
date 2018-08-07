package com.musala.training.design.patterns.behavioral.mediator;

import com.musala.training.design.patterns.behavioral.command.command.Command;

public class TurnOnAllLightsCommand implements Command {

    private Mediator mediator;

    public TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
