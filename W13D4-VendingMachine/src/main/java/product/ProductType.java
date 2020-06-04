package product;

import behaviour.IProduct;

public enum ProductType implements IProduct {
        A1(1,"Cola"),
        A2(0.50,"Crisps"),
        A3(0.65,"Sweets");

        public final double value;
        public final String name;

        ProductType(double value,String name){
                this.value = value;
                this.name = name;
        }

        public double getValue(){
                return this.value;
        }

        public String getName(){
                return this.name;
        }

        public void addProduct(IProduct product){
                //does nothing
        }
}

