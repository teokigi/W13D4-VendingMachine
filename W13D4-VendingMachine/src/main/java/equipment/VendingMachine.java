package equipment;

import behaviour.IProduct;
import product.ProductType;
import user.CoinType;

import java.util.ArrayList;

public class VendingMachine implements IProduct{

    private double currencyAmount;
    private final ArrayList<IProduct> products;
    private final ArrayList<CoinType> coinBucket;


    public VendingMachine(){
        this.currencyAmount = 0;
        this.products = new ArrayList<>();
        this.coinBucket = new ArrayList<>();
    }


    public void AddValue(double amount){
        this.currencyAmount += amount;
    }


    //adds a product
    public void addStock(IProduct product){
        products.add(product);
    }
    //removes a product
    public void removeProduct(IProduct product){
        products.remove(product);
    }
    //returns true if coin value is valid
    public boolean acceptedCoins(CoinType coin){
         ArrayList<CoinType> validCoins = new ArrayList<>();
        validCoins.add(CoinType.TENPENCE);
        validCoins.add(CoinType.TWENTYPENCE);
        validCoins.add(CoinType.FIFTYPENCE);
        validCoins.add(CoinType.ONEPOUND);

        return  validCoins.contains(coin);
    }

    public void addCoin(CoinType coin){
            coinBucket.add(coin);
            AddValue(coin.getValue());
    }

    // redundant, doesn't do anything.
public double getProductCost(ProductType product){
        return product.getValue();
    }
    // returns the amount remaining to buy product.
    public boolean canBuyProduct(ProductType product){
        return this.currencyAmount > product.getValue();
    }

}
// the person selects item, Vending machine shows price, person adds coin, vending machine shows remaing price, person adds coin. until ok vending returns product and currentAmount set to 0.

// the person puts in money, vending machine shows how much is in currentAmount, puts more money, then person chooses product. Vending checks if it has enough money to purchase. if yes dispense product and reset curerntamount.