package instruments;

public class Guitar extends Instrument  {
    private int numStrings;

    public Guitar(String make, String model, String colour, InstrumentClassification classification, int numStrings) {
        super(make, model, colour, classification);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }


}
