package com.musala.training.design.patterns.behavioral.command.invoker;

import com.musala.training.design.patterns.behavioral.command.command.Command;

//Invoker
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }

    public void storeAbdExecute(Command command) {
        command.execute();
    }
}
