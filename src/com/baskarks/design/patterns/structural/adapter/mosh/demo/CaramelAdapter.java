package com.baskarks.design.patterns.structural.adapter.mosh.demo;


import com.baskarks.design.patterns.structural.adapter.mosh.demo.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter {
  @Override
  public void apply(Image image) {
    init();
    render(image);
  }
}
