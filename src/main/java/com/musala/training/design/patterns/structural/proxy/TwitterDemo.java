package com.musala.training.design.patterns.structural.proxy;

public class TwitterDemo {
    public static void main(String[] args) {

        //ITwitterService service = (ITwitterService)SecurityProxy.newInstance(new TwitterServiceStub());

        ITwitterService service = (ITwitterService)SecurityProxy.newInstance(new TwitterServiceImpl());

        //this will throw exception
        service.postToTimeline("bh5k" , "Some message that shouldn't go through.");
        System.out.println(service.getTimeline("bhk"));
    }
}
