import accessories.Amp;
import accessories.Pedal;
import instruments.Guitar;
import instruments.InstrumentClassification;
import instruments.Piano;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop1;
    private Guitar guitar1;
    private Piano piano1;
    private Trumpet trumpet1;
    private Amp amp1;
    private Pedal pedal1;

    @Before
    public void before() {
        shop1 = new Shop("Sound Clan");
        guitar1 = new Guitar("Fender", "Stratocaster", "Sunburst", InstrumentClassification.STRINGS, 6);
        piano1 = new Piano("Steinway & Sons", "Model D", "Black", InstrumentClassification.STRINGS, "Concert Grand" );
        trumpet1 = new Trumpet("Henri Selmer", "B-flat", "Yellow", InstrumentClassification.BRASS, 3);
        amp1 = new Amp("Marshall", "VBA400", "Valve");
        pedal1 = new Pedal("Ibanez", "Tube Screamer TS9", "Overdrive");

    }


    @Test
    public void canGetName() {
        assertEquals("Sound Clan", shop1.getName());
    }

    @Test
    public void canGetStock() {
        assertEquals(0, shop1.getStock().size());
    }

    @Test
    public void canHadProductsToStock() {
        shop1.addToStock(guitar1, piano1, trumpet1, amp1, pedal1);
        assertEquals(5, shop1.getStock().size());
    }

    @Test
    public void canRemoveProductsFromStock() {
        shop1.addToStock(guitar1, piano1, trumpet1, amp1, pedal1);
        shop1.removeFromStock(piano1, trumpet1);
        assertEquals(3, shop1.getStock().size());
    }

}
