package com.baskarks.design.patterns.behavioral.visitor;

public class Demo {
    public static void main(String[] args) {
        var waveFile = WavFile.read("music.wav");
        waveFile.execute(new ReduceNoiseOperation());
        waveFile.execute(new AddReverbOperation());
        waveFile.execute(new NormalizeOperation());
    }
}
