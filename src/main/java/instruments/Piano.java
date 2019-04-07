package instruments;

public class Piano extends Instrument {

    private String type;

    public Piano(String make, String model, String colour, InstrumentClassification classification, String type) {
        super(make, model, colour, classification);
        this.type = type;

    }

    public String getType() {
        return this.type;
    }

    public String play() {
        return "plink plink plink";
    }
}
