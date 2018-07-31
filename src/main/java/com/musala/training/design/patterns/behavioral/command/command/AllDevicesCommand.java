package com.musala.training.design.patterns.behavioral.command.command;

import com.musala.training.design.patterns.behavioral.command.receiver.Device;

import java.util.List;

public class AllDevicesCommand implements Command {

    private List<Device> devices;

    public AllDevicesCommand(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        for (Device device : devices) {
            if(device.isOn()) {
                device.toggle();
            }
        }
    }
}
