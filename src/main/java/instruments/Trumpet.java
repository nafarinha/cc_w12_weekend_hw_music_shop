package instruments;

public class Trumpet extends Instrument {

    private int numValves;

    public Trumpet(String make, String model, String colour, InstrumentClassification classification, int numValves) {
        super(make, model, colour, classification);
        this.numValves = numValves;
    }

    public int getNumValves() {
        return this.numValves;
    }

    public String play() {
        return "Tarantara";
    }


}
