package org.mvpigs.pigcoin;

import java.security.PublicKey;

public class Transaction {
    private String hash = "";
    private String prevHash = "";
    private PublicKey origen;
    private PublicKey destino;
    private int pigcoin = 0;
    private String mensaje = "";


    public Transaction(){

    }

    public Transaction(String hash, String prevHash, PublicKey origen, PublicKey destino, int pigcoin, String mensaje){
        this.hash = hash;
        this.prevHash = prevHash;
        this.origen = origen;
        this.destino = destino;
        this.pigcoin = pigcoin;
        this.mensaje = mensaje;
    }
}
