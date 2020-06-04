package equipment;

import behaviour.IProduct;
import product.ProductType;
import user.CoinType;

import java.util.ArrayList;

public class VendingMachine implements IProduct{

    private double currencyAmount;
    private ArrayList<IProduct> products;
    private ArrayList<CoinType> coinBucket;


    public VendingMachine(){
        this.currencyAmount = 0;
        this.products = new ArrayList<IProduct>();
    }


    public double addMoney(double amount){
        this.currencyAmount += amount;
    }

    public void calculate(){

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

    public double moneyInsertion(CoinType coin){
        if(acceptedCoins(coin)){
            addMoney(coin.getValue());
            return this.currencyAmount;
        } else{
            rejectCoin(coin);
            return this.currencyAmount;
        }
    }

    public CoinType rejectCoin(CoinType coin){
        return coin;
    }

    //TODO method When the respective code is entered and enough money has been inserted, the product is returned and the current amount will be set to £0.00.
    public double getProductCost(ProductType product){
        return product.getValue();
    }
    // returns the amount remaining to buy product.
    public IProduct dispenseItem(ProductType product){
//        if(this.currencyAmount == 0){
//            //go and get product price.
//            product.getValue();
//        }
        if(this.currencyAmount > product.getValue()){
            this.currencyAmount = 0;
            return product;
        }
    }
}
// the person selects item, Vending machine shows price, person adds coin, vending machine shows remaing price, person adds coin. until ok vending returns product and currentAmount set to 0.

// the person puts in money, vending machine shows how much is in currentAmount, puts more money, then person chooses product. Vending checks if it has enough money to purchase. if yes dispense product and reset curerntamount.