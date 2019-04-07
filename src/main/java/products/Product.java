package products;

import Interfaces.ISell;

public abstract class Product implements ISell {
    private double purchasePrice, salePrice;

    public Product() {
        this.purchasePrice = 0;
        this.salePrice = 0;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double calculateMarkup() {
        return (getSalePrice()/getPurchasePrice()) - 1;
    }


}
