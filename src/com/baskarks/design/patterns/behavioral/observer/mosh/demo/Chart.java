package com.baskarks.design.patterns.behavioral.observer.mosh.demo;

public class Chart implements Observer {
  private DataSource dataSource;

  public Chart(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public void update() {
    System.out.println("Chart got updated: " + dataSource.getValue());
  }
}
