package com.musala.training.design.patterns.structural.proxy;

public class TwitterServiceStub implements ITwitterService {
    @Override
    public String getTimeline(String screenName) {
        return "Fake text for timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
