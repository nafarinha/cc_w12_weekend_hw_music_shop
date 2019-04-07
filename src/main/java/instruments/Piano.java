package instruments;

import Interfaces.IPlay;

public class Piano extends Instrument implements IPlay {

    private String type;

    public Piano(String make, String model, String colour, InstrumentClassification classification, String type) {
        super(make, model, colour, classification);
        this.type = type;

    }

    public String getType() {
        return this.type;
    }
}
