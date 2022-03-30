package com.groupproject.blockchain.bean;

import java.util.ArrayList;

public class CoinbaseTransaction extends Transaction {

    public static final int coinbaseAmount = 50;

    public int blockHeight;

    public int getBlockHeight() {
        return blockHeight;
    }

    public void setBlockHeight(int blockHeight) {
        this.blockHeight = blockHeight;
    }

    public CoinbaseTransaction( ArrayList<TxOut> outputs, String transactionId, double transactionFees, String signaturedData) {
        super(null, outputs, transactionId, transactionFees, signaturedData);

        //TODO: Set Block height -> how to calculate this?
    }



}
