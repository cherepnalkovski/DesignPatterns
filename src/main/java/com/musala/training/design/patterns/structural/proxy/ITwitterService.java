package com.musala.training.design.patterns.structural.proxy;

public interface ITwitterService {
    String getTimeline(String screenName);
    void postToTimeline(String screenName, String message);
}
