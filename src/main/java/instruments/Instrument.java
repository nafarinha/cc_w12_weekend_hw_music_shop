package instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String make, model, colour;
    private InstrumentClassification classification;
    private double purchasePrice, salePrice;

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

    public InstrumentClassification getClassification() {
        return classification;
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
