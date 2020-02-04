package com.baskarks.design.patterns.behavioral.template.mosh.demo;

public abstract class Task {
  private AuditTrail auditTrail;

  public Task() {
    auditTrail = new AuditTrail();
  }

  public Task(AuditTrail auditTrail) {
    this.auditTrail = auditTrail;
  }

  public void execute() {
    auditTrail.record();

    doExecute();
  }

  protected abstract void doExecute();
}
