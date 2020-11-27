package com.baskarks.design.patterns.practice.templatetwo;

import java.util.ArrayList;
import java.util.List;

public class AuditTrail {
    private List<String> records = new ArrayList<>();
    public void record(String data) {
        System.out.println("AudiTrail :: Recording Transactions");
        captureData(data);
    }
    private void captureData(String data) {
        records.add(data);
    }

    public void showCaptures() {
        for (String entry: records) {
            System.out.println(entry);
        }
    }
}
