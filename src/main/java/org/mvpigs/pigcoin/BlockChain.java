package org.mvpigs.pigcoin;
import java.util.ArrayList;

public class BlockChain {
    private ArrayList<Transaction> bChain = new ArrayList<>();

    public  BlockChain() {

    }


    public void addOrigin(Transaction trx){
        bChain.add(trx);
    }

    public void summarize(){
        for (Transaction block : bChain) {
            System.out.println(block);
        }
    }

    public Object summarize(Integer position){
        return bChain.toArray()[position];

    }

}
