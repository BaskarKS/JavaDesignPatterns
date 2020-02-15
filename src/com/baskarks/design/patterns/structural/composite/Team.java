package com.baskarks.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Deployable {
  private List<Deployable> resources = new ArrayList<>();

  public void add(Deployable resource) {
    resources.add(resource);
  }

  public void deploy() {
    for (var resource : resources) {
      resource.deploy();
    }
  }
}
