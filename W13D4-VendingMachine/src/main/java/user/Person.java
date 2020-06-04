package user;

import behaviour.IProduct;
import product.ProductType;

import java.util.ArrayList;

public class Person{

    private ArrayList<IProduct> snacks;
    private ArrayList<CoinType> coin;

    public Person(){
        this.snacks = new ArrayList<>();
        this.coin = new ArrayList<>();
    }



    //when vending machine rejects coin adds back to person.
}
