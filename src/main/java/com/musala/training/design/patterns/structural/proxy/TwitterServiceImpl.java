package com.musala.training.design.patterns.structural.proxy;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

public class TwitterServiceImpl implements ITwitterService{

    private static final String TWITTER_CONSUMER_KEY = "";
    private static final String TWITTER_SECRET_KEY = "";
    private static final String TWITTER_ACCESS_TOKEN = "";
    private static final String TWITTER_ACCESS_TOKEN_SECRET = "";


    @Override
    public String getTimeline(String screenName) {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
                .setOAuthConsumerSecret(TWITTER_SECRET_KEY)
                .setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);

        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        StringBuilder builder = new StringBuilder();
        try {
            Query query = new Query(screenName);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    builder.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                    builder.append("\n");
                }
            }
            while ((query = result.nextQuery()) != null);
        } catch (TwitterException e) {
            e.printStackTrace();
            System.out.println("Failed to search tweets :" + e.getMessage());
        }
        return cb.toString();
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println(message);
    }
}
