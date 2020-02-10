package com.baskarks.design.patterns.behavioral.visitor.mosh.solution;

public class Demo {
    public static void show() {
        var wavFile = WavFile.read("myfile.wav");
        wavFile.applyFilter(new NoiseReductionFilter());
        wavFile.applyFilter(new ReverbFilter());
        wavFile.applyFilter(new NormalizeFilter());
    }
}
