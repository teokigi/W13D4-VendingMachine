package user;

import behaviour.ICoin;

public enum CoinType implements ICoin {
    ONEPENCE(0.01),
    TWOPENCE(0.02),
    FIVEPENCE(0.05),
    TENPENCE(0.10),
    TWENTYPENCE(0.20),
    FIFTYPENCE(0.50),
    ONEPOUND(1.00);

    public final double value;

    CoinType(double value){
        this.value = value;
    }

    public double getValue(){
        return this.value;
    }
    //returns true if coin value is greater than 0.09
    public boolean acceptedCoins(CoinType coin){
        return  coin.getValue() > 0.09;
    }

    public void addCoin(ICoin coin){

    }

}
