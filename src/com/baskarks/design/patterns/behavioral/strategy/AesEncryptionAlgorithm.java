package com.baskarks.design.patterns.behavioral.strategy;

public class AesEncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting message using AES");
        return "AESEncrypted " + message;
    }
}
