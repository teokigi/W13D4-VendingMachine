package equipment;

import behaviour.IProduct;

import java.util.ArrayList;

public class VendingMachine implements IProduct{

    private double currencyAmount;
    private ArrayList<IProduct> products;


    public VendingMachine(){
        this.currencyAmount = 0;
        this.products = new ArrayList<IProduct>();
    }


    public void addMoney(double amount){
        this.currencyAmount += amount;
    }

    public void calculate(){

    }

}
