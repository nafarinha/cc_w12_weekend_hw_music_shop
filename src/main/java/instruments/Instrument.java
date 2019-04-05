package instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String make, model, colour;
    private double purchasePrice, salePrice;
    private InstrumentType type;

    public Instrument(String make, String model, String colour, InstrumentType type ) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.type = type;
        this.purchasePrice = 0;
        this.salePrice = 0;

    };

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
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

    public double calculateMarkup() {
        return (getSalePrice()/getPurchasePrice()) - 1;
    }

    public String play(String sound) {
        return sound;
    };


}
