package com.baskarks.design.patterns.behavioral.command.mosh.demo;

import com.baskarks.design.patterns.behavioral.command.mosh.demo.fx.Command;


public class AddCustomerCommand implements Command {
  private CustomerService service;

  public AddCustomerCommand(CustomerService service) {
    this.service = service;
  }

  @Override
  public void execute() {
    service.addCustomer();
  }
}
