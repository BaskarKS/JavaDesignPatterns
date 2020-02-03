package com.baskarks.design.patterns.behavioral.strategy;

public class DesEncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting message using DES");
        return "DESEncrypted " + message;
    }
}
