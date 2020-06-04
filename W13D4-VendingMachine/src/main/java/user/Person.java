package user;

import behaviour.IProduct;
import product.ProductType;

import java.util.ArrayList;

public class Person implements IProduct{

    private ArrayList<IProduct> snacks;
    private ProductType snack;
    private CoinType coin;

    public Person(ProductType snack, CoinType coin){
        this.snacks = new ArrayList<>();
        this.snack = snack;
        this.coin = coin;
    }

    public void calculate(){

    }

}
