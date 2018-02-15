package org.mvpigs.pigcoin;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;

public class Wallet {
    private PrivateKey SK = null;
    public PublicKey Address = null;
    private double totalInput = 0d;
    private double totalOutput = 0d;
    private double balance = 0d;


    public Wallet(){
        this.SK = SK;
        this.Address = Address;
        this.totalInput = totalInput;
        this.totalOutput = totalOutput;
        this.balance = balance;
    }

    public void setSK(PrivateKey SK){
        this.SK = SK;
    }

    public void setAddress(PublicKey Address){
        this.Address = Address;
    }

    public PublicKey getAddress() {
        return Address;
    }

    public void generateKeyPair(){
        KeyPair pair = GenSig.generateKeyPair();
        setSK(pair.getPrivate());
        setAddress(pair.getPublic());
    }

    public void loadCoins(BlockChain bChain){
        for (Transaction trans : )
    }



}
