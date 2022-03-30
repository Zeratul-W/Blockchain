package com.groupproject.blockchain.bean;

import java.util.Date;

//Block Structure
public class Block {
    //The height of block, start from 0
    public int index;
    //UnixTime
    public long timeStamp;
    public String hash;
    //Encrypted via Algo SHA-256
    public String previousHash;
    //Any data, including Txs stored here
    public String data;
    //add difficulty and nonce,WJM
    public int nonce;
    public int difficulty;


    //QUESTION: Should we include a possible list of transactions here? How do we generate new transactions?

    //Block constructor
    public Block(String data, String previousHash, int index, int nonce, int difficulty){
        this.index = index;
        this.timeStamp = new Date().getTime()/1000;
        this.hash = getHash();
        this.previousHash = previousHash;
        this.data = data;
        this.nonce = nonce;
        this.difficulty = difficulty;
    }

    //Block Hash
    public String getHash(){
        String value = Sha256Util.applySha256(
                Integer.toString(index)+ Long.toString(timeStamp)
                + previousHash + data
        );
        return value;
    }

    //For validation test
    public String hashTest(String index, String timeStamp, String previousHash, String data){
        return hash = Sha256Util.applySha256(index+ timeStamp+ previousHash+ data);
    }



    //hash for PoW
    public String getHashPow(){
        String hashPow = Sha256Util.applySha256(
                Integer.toString(index)+ previousHash+Long.toString(timeStamp)
                        +data+Integer.toString(difficulty)+Integer.toString(nonce)
        );
        return hashPow;
    }




    //join difficulty
    public void mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0"
        String hashPow;
        do{
            hashPow = getHashPow();
            nonce ++;
        }while(!hashPow.substring( 0, difficulty).equals(target));

        System.out.println("Mining Successful with hash equals to " + hash);
    }
}
