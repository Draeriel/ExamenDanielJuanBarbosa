package org.mvpigs.pigcoin;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Wallet {
    private PrivateKey SK = null;
    public PublicKey Address = null;

    public Wallet(){

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
        getAddress();
    }
}
