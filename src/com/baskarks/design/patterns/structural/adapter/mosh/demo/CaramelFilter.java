package com.baskarks.design.patterns.structural.adapter.mosh.demo;

import com.baskarks.design.patterns.structural.adapter.mosh.demo.avaFilters.Caramel;

public class CaramelFilter implements Filter {
  private Caramel caramel;

  public CaramelFilter(Caramel caramel) {
    this.caramel = caramel;
  }

  @Override
  public void apply(Image image) {
    caramel.init();
    caramel.render(image);
  }
}
