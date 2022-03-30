package com.groupproject.blockchain.bean;

import java.util.ArrayList;

public class Transaction {

    //Each transaction can have multiple inputs and outputs -> each element in the list is a public key to specify
    // the input and output
    public ArrayList<TxIn> inputs;
    public ArrayList<TxOut> outputs;
    public String transactionId;

    public double transactionFees;

    public Transaction(ArrayList<TxIn> inputs, ArrayList<TxOut> outputs, String transactionId, double transactionFees, String signaturedData) {
        this.inputs = inputs;
        this.outputs = outputs;
        this.transactionId = transactionId;
        this.transactionFees = transactionFees;
        this.signaturedData = signaturedData;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    public ArrayList<TxIn> getInputs() {
        return inputs;
    }

    public void setInputs(ArrayList<TxIn> inputs) {
        this.inputs = inputs;
    }

    public ArrayList<TxOut> getOutputs() {
        return outputs;
    }

    public void setOutputs(ArrayList<TxOut> outputs) {
        this.outputs = outputs;
    }

    public double getTransactionFees() {
        return transactionFees;
    }

    public void setTransactionFees(double transactionFees) {
        this.transactionFees = transactionFees;
    }

    public String getSignaturedData() {
        return signaturedData;
    }

    public void setSignaturedData(String signaturedData) {
        this.signaturedData = signaturedData;
    }

    public String signaturedData;

    @Override
    public String toString() {
        return "Transaction{" +
                "inputs=" + inputs +
                ", outputs=" + outputs +
                ", transactionFees=" + transactionFees +
                ", signaturedData='" + signaturedData + '\'' +
                '}';
    }


    public static String getTransactionId(Transaction transaction){

        //TODO: implement funciton
        return "";


    }




}
