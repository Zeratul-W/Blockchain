package com.groupproject.blockchain.bean;//please do not delete it ,trying to update a function to automatically increase difficulty


//package com.groupproject.blockchain.bean;
//
//public class PoW {
//    public static String getHashPow(Integer index,String previousHash,Long timeStamp,String data,Integer difficulty,Integer nonce){
//        String hashPow = Sha256Util.applySha256(
//                Integer.toString(index)+ previousHash + Long.toString(timeStamp)
//                        +data+Integer.toString(difficulty)+Integer.toString(nonce)
//        );
//        return hashPow;
//    }
//
//
//    public void mineBlock(Integer index,String previousHash,Long timeStamp,String data,Integer difficulty,Integer nonce) {
//        String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0"
//        while(!hash.substring( 0, difficulty).equals(target)) {
//            nonce ++;
//            hash = getHashPow(index,previousHash,timeStamp,data,difficulty,nonce);
//        }
//        System.out.println("Mining Successful with hash equals to " + hash);
//    }
//}
