package accessories;

import Interfaces.ISell;

public class Accessory implements ISell {

    private String make;
    private String model;
    private String type;
    private double purchasePrice, salePrice;

    public Accessory(String make, String model, String type) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.purchasePrice = 0;
        this.salePrice = 0;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
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
