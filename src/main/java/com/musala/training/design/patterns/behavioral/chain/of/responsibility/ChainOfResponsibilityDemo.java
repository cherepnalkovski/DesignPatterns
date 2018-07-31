package com.musala.training.design.patterns.behavioral.chain.of.responsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {

        Director ubavkov = new Director();
        VP elena = new VP();
        CEO dido = new CEO();

        ubavkov.setSuccessor(elena);
        elena.setSuccessor(dido);

        Request request = new Request(RequestType.CONFERENCE , 500);
        ubavkov.handleRequest(request);

        request = new Request(RequestType.PURCHASE , 1000);
        ubavkov.handleRequest(request);

        request = new Request(RequestType.PURCHASE , 2000);
        ubavkov.handleRequest(request);


    }
}
