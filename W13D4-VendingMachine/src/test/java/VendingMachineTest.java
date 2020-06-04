import equipment.VendingMachine;
import org.junit.Before;
import org.junit.Test;
import product.ProductType;
import user.CoinType;
import user.Person;

import static org.junit.Assert.*;

public class VendingMachineTest {

    Person person;
    VendingMachine vendor;

    @Before public void setup(){
        person = new Person();
        person.addCoin(CoinType.ONEPENCE);
        person.addCoin(CoinType.TWOPENCE);
        person.addCoin(CoinType.FIVEPENCE);
        person.addCoin(CoinType.TENPENCE);
        person.addCoin(CoinType.TWENTYPENCE);
        person.addCoin(CoinType.FIFTYPENCE);
        person.addCoin(CoinType.ONEPOUND);
        vendor = new VendingMachine();
    }

    @Test public void vendorStartsEmpty(){
        assertEquals(0,vendor.getProducts());
    }

    @Test public void vendorCurrencyStartsAtZero(){
        assertEquals(0,vendor.getCurrencyAmount(),0.01);
    }

    @Test public void canAddProducts(){
        vendor.addProduct(ProductType.A1);
        assertEquals(1,vendor.getProducts().size());
    }

    @Test public void canRemoveProducts(){
        vendor.addProduct(ProductType.A1);
        vendor.removeProduct(ProductType.A1);
        assertEquals(0,vendor.getProducts().size());
    }

    @Test public void canAddCoinTrue(){
        vendor.addCoin(CoinType.FIFTYPENCE);
        assertTrue(vendor.getCurrencyAmount()==0.50);
    }
    @Test public void canAddCoinFalse(){
        vendor.addCoin(CoinType.TWOPENCE);
        assertFalse(vendor.getCurrencyAmount()==0.02);
    }

    @Test public void canClearCurrencyAmount(){
        vendor.addCoin(CoinType.FIFTYPENCE);
        vendor.clearBalance();
        assertEquals(0,vendor.getCurrencyAmount(),0.01);
    }


}
