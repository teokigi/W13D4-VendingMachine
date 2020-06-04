package equipment;

import behaviour.ICoin;
import behaviour.IProduct;
import product.ProductType;
import user.CoinType;

import java.util.ArrayList;

public class VendingMachine implements IProduct, ICoin {

    private double currencyAmount;
    private final ArrayList<IProduct> products;
    private final ArrayList<ICoin> coinBucket;


    public VendingMachine(){
        this.currencyAmount = 0;
        this.products = new ArrayList<>();
        this.coinBucket = new ArrayList<>();
    }

    public double getCurrencyAmount() {
        return currencyAmount;
    }


    public boolean isCoinAcceptable(ICoin coin){
        ArrayList<ICoin> validCoins = new ArrayList<>();
        validCoins.add(CoinType.TENPENCE);
        validCoins.add(CoinType.TWENTYPENCE);
        validCoins.add(CoinType.FIFTYPENCE);
        validCoins.add(CoinType.ONEPOUND);

        return  validCoins.contains(coin);
    }

    public void addCoin(ICoin coin){
        if (isCoinAcceptable(coin)) {
            coinBucket.add(coin);
            addValue(coin.getValue());
        }
    }

    public void addValue(double amount){
        this.currencyAmount += amount;
    }

    public void clearBalance(){
        this.currencyAmount = 0;
    }

    public ArrayList<IProduct> getProducts() {
        return products;
    }

    //adds a product
    public void addProduct(IProduct product){
        products.add(product);
    }
    //removes a product
    public void removeProduct(IProduct product){
        products.remove(product);
    }
    //returns true if coin value is valid

    public double getProductCost(ProductType product){
        return product.getValue();
    }

}
// the person selects item, Vending machine shows price, person adds coin, vending machine shows remaing price, person adds coin. until ok vending returns product and currentAmount set to 0.

// the person puts in money, vending machine shows how much is in currentAmount, puts more money, then person chooses product. Vending checks if it has enough money to purchase. if yes dispense product and reset curerntamount.