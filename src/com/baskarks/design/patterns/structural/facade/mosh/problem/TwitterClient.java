package com.baskarks.design.patterns.structural.facade.mosh.problem;

import java.util.ArrayList;
import java.util.List;

public class TwitterClient {
  public List<Tweet> getRecentTweets(String accessToken) {
    System.out.println("Getting recent tweets");

    return new ArrayList<>();
  }
}
