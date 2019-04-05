package instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String make, model, material, colour;
    private double purchasePrice, salePrice;
    private InstrumentType type;

    public Instrument(String make, String model, String material, String colour, InstrumentType type ) {
        this.make = make;
        this.model = model;
        this.material = material;
        this.colour = colour;
        this.type = type;
    };

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
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

    public InstrumentType getType() {
        return type;
    }


}
