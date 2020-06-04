package user;

import java.util.ArrayList;

public class Person {

    private ArrayList<CoinType> wallet;

    public Person(ArrayList<CoinType> coins){
        this.wallet = coins;
    }
}
