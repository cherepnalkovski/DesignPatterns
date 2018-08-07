package com.musala.training.design.patterns.behavioral.mediator;

import com.musala.training.design.patterns.behavioral.command.receiver.Light;

import java.util.ArrayList;
import java.util.List;

//can be abstract. But in this example i will not implement multiple mediators, so we don't need abstract class or interface.
public class Mediator {

    private List<Light> lights = new ArrayList<>();

    public void registerLight(Light light) {
        lights.add(light);
    }

    public void turnOnAllLights() {
        for(Light light : lights) {
            if(!light.isOn()) {
                light.toggle();
            }
        }
    }

    public void turnOffAllLights() {
        for (Light light: lights) {
            if(light.isOn()) {
                light.toggle();
            }
        }
    }
}
