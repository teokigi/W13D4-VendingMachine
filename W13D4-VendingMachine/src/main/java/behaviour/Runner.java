package behaviour;

import equipment.VendingMachine;
import product.ProductType;

public class Runner {

    public static void main(String[] args) {
        VendingMachine vendy = new VendingMachine();
        ProductType snack = ProductType.A1;
        ProductType snack2 = ProductType.A1;
        ProductType snack3 = ProductType.A1;
        vendy.addStock(snack);
        vendy.addStock(snack2);
        vendy.addStock(snack3);


    }
}
