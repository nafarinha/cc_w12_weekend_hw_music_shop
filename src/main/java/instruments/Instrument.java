package instruments;

import Interfaces.IPlay;
import products.Product;

public abstract class Instrument extends Product implements IPlay {

    private String make, model, colour;
    private InstrumentClassification classification;

    public Instrument(String make, String model, String colour, InstrumentClassification classification ) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.classification = classification;

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

}
