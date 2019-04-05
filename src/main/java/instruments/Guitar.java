package instruments;

public class Guitar extends Instrument  {
    private int numStrings;

    public Guitar(String make, String model, String colour, InstrumentType type, int numStrings) {
        super(make, model, colour, type);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }


}
