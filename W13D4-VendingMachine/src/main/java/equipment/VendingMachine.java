package equipment;

public class VendingMachine {

    private double currencyAmount;

    // initializes at 0 has no coins.
    public VendingMachine(){
        this.currencyAmount = 0;
    }
    // machine starts with 0
    // person puts in money
    // £1.00, currency amount.
    // person selects item through the code. A2 for crisp
    // vending machine compares

    public void addMoney(double amount){
        this.currencyAmount += amount;
    }

}

// person puts coins in.