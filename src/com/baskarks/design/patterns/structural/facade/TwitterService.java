package com.baskarks.design.patterns.structural.facade;

import java.util.List;

public class TwitterService {
    private String appKey;
    private String appSecret;

    public TwitterService(String key, String secret) {
        this.appKey = key;
        this.appSecret = secret;
    }

    public List<Tweet> getRecentTweets() {
        var client = new TwitterClient();
        return client.getRecentTweets(getAccessToken(appKey, appSecret));
    }

    private String getAccessToken(String appKey, String appSecret) {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(appKey, appSecret);
        var accessToken = oauth.getAccessToken(requestToken);
        return accessToken;
    }
}
