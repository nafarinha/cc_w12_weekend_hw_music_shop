package accessories;

import Interfaces.ISell;

public class Accessory implements ISell {

    private String description;
    private double purchasePrice, salePrice;

    public Accessory(String description) {
        this.description = description;
        this.purchasePrice = 0;
        this.salePrice = 0;
    }

    public String getDescription() {
        return this.description;
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
