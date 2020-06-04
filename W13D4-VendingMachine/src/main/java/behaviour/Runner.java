package behaviour;

import equipment.VendingMachine;
import product.ProductType;

public class Runner {

    public static void main(String[] args) {
        VendingMachine vendy = new VendingMachine();
        ProductType snack = ProductType.A1;
        ProductType snack2 = ProductType.A1;
        ProductType snack3 = ProductType.A1;
        vendy.addProduct(snack);
        vendy.addProduct(snack2);
        vendy.addProduct(snack3);


    }
}
