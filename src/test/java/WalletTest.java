import org.junit.Before;
import org.junit.Test;
import org.mvpigs.pigcoin.GenSig;
import org.mvpigs.pigcoin.Wallet;

import java.security.KeyPair;

import static org.junit.Assert.assertEquals;


public class WalletTest {

    private Wallet monedero;
    private KeyPair pair;


    @Before
    public void crearEstaciones(){
        monedero = new Wallet();
        KeyPair pair = GenSig.generateKeyPair();

    }

    @Test
    public void testSetSK(){
        monedero.setSK(pair.getPrivate());
        System.out.println("\n Direccion de la Wallet_1: \n" +  monedero.getAddress().hashCode());

    }

    @Test
    public void testSetAddress(){
        monedero.setAddress(pair.getPublic());
    }
}
