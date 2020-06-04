import behaviour.ICoin;
import org.junit.Before;
import org.junit.Test;
import product.ProductType;
import user.CoinType;
import user.Person;

import static org.junit.Assert.assertEquals;

public class PersonTest{

    Person person;

    @Before
    public void setup(){
        person = new Person();
    }

    @Test public void startWithEmptySnacks(){
        assertEquals(0,person.getSnacks().size());
    }

    @Test public void canAddSnacks(){
        person.addSnack(ProductType.A1);
        assertEquals(1,person.getSnacks().size());
    }

    @Test public void startWithEmptyCoins(){
        assertEquals(0,person.getCoins().size());
    }

    @Test public void canAddCoin(){
        ICoin coin = CoinType.ONEPOUND;
        person.addCoin(CoinType.ONEPOUND);
        assertEquals(1,person.getCoins().size());
    }

    @Test public void canRemoveCoin(){
        person.addCoin(CoinType.ONEPOUND);
        person.removeCoin(CoinType.ONEPOUND);
        assertEquals(0,person.getCoins().size());
    }
}
