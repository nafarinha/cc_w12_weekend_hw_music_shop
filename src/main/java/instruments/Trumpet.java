package instruments;

public class Trumpet extends Instrument {

    private int numValves;

    public Trumpet(String make, String model, String colour, InstrumentType type, int numValves) {
        super(make, model, colour, type);
        this.numValves = numValves;
    }

    public int getNumValves() {
        return this.numValves;
    }
}
