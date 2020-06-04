package user;

import behaviour.ICoin;
import behaviour.IProduct;

import java.util.ArrayList;

public class Person implements ICoin {

    private final ArrayList<IProduct> snacks;
    private final ArrayList<ICoin> coins;

    public Person(){
        this.snacks = new ArrayList<>();
        this.coins = new ArrayList<>();
    }

    public ArrayList<IProduct> getSnacks() {
        return snacks;
    }

    public void addSnack(IProduct product){
        snacks.add(product);
    }

    public void removeSnack(IProduct product){
        snacks.remove(product);
    }

    public ArrayList<ICoin> getCoins() {
        return coins;
    }

    public void addCoin(ICoin coin){
        coins.add(coin);
    }

    public void removeCoin(ICoin coin){
        coins.remove(coin);
    }


    //when vending machine rejects coin adds back to person.
}
