package com.musala.training.design.patterns.behavioral.command;

import com.musala.training.design.patterns.behavioral.command.command.*;
import com.musala.training.design.patterns.behavioral.command.invoker.Switch;
import com.musala.training.design.patterns.behavioral.command.receiver.Device;
import com.musala.training.design.patterns.behavioral.command.receiver.Fan;
import com.musala.training.design.patterns.behavioral.command.receiver.Light;

import java.util.ArrayList;
import java.util.List;

//Client
public class CommandDemo {

    public static void main(String[] args) {

        //Receiver
        Light bedroomLight = new Light();
        //Receiver
        Light kitchenLight = new Light();
        //Receiver
        Fan fan = new Fan();

        //Invoker
        Switch deviceSwitch = new Switch();

        //Concrete command
        Command toggleCommand = new ToggleCommand(bedroomLight);
        Command toggleFanCommand = new ToggleFanCommand(fan);

        //Switch invoker is executing onCommand-Concrete Command on the Receiver which is Light.
        deviceSwitch.storeAndExecute(toggleCommand);
        deviceSwitch.storeAndExecute(toggleCommand);
        deviceSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        Command allLightsCommand = new AllLightsCommand(lights);

        deviceSwitch.storeAbdExecute(allLightsCommand);


        deviceSwitch.storeAndExecute(toggleCommand);
        deviceSwitch.storeAndExecute(toggleFanCommand);

        List<Device> devices = new ArrayList<>();
        devices.add(bedroomLight);
        devices.add(kitchenLight);
        devices.add(fan);

        AllDevicesCommand allDevicesCommand = new AllDevicesCommand(devices);

        deviceSwitch.storeAndExecute(allDevicesCommand);

    }
}
