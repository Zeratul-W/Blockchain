package com.groupproject.blockchain.bean;

public class TxOut {

    public String address;
    public float amount;

    public TxOut(String address, float amount) {
        this.address = address;
        this.amount = amount;
    }
}
