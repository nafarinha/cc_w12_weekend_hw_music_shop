package instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String make, model, colour;
    private double purchasePrice, salePrice;
    private InstrumentClassification classification;

    public Instrument(String make, String model, String colour, InstrumentClassification classification ) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.classification = classification;
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

    public InstrumentClassification getType() {
        return classification;
    }

    public double calculateMarkup() {
        return (getSalePrice()/getPurchasePrice()) - 1;
    }

    public String play(String sound) {
        return sound;
    };


}
