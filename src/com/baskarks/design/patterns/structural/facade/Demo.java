package com.baskarks.design.patterns.structural.facade;

public class Demo {
  public static void show() {
/*
    var oauth = new OAuth();
    var requestToken = oauth.requestToken("appKey", "secret");
    var accessToken = oauth.getAccessToken(requestToken);

*/
    var twitterService = new TwitterService("appKey", "secret");
    var tweets = twitterService.getRecentTweets();
/*
    var twitterClient = new TwitterClient();
    var tweets = twitterClient.getRecentTweets(accessToken);
*/
  }
}
