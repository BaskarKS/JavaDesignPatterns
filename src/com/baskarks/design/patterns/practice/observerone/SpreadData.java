package com.baskarks.design.patterns.practice.observerone;

import java.util.ArrayList;
import java.util.List;

public class SpreadData extends BaseObserver {
    private int dataValue;
    public SpreadData() {
        dataValue = 0;
    }
    public void setDataValue(int value) {
        this.dataValue = value;
        notifySpreadDataObserver(value);
    }

    public int getDataValue() {
        return this.dataValue;
    }
}
