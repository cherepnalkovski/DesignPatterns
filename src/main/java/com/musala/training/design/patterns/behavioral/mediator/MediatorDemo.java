package com.musala.training.design.patterns.behavioral.mediator;

import com.musala.training.design.patterns.behavioral.command.command.AllLightsCommand;
import com.musala.training.design.patterns.behavioral.command.command.Command;
import com.musala.training.design.patterns.behavioral.command.receiver.Light;

// Mediator pattern in combination with Command pattern.
public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light bedroomLight = new Light();
        Light kitchenLight = new Light();

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);

        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);

        turnOffAllLightsCommand.execute();

    }
}
