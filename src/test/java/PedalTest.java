import accessories.Pedal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PedalTest {

    public Pedal pedal1;

    @Before
    public void before() {
        pedal1 = new Pedal("Ibanez", "Tube Screamer TS9", "Overdrive");
    }

    @Test
    public void canGetMake() {
        assertEquals("Ibanez", pedal1.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Tube Screamer TS9", pedal1.getModel());
    }

    @Test
    public void canGetType() {
        assertEquals("Overdrive", pedal1.getType());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(0, pedal1.getPurchasePrice(), 0);
    }

    @Test
    public void canSetPurchasePrice() {
        pedal1.setPurchasePrice(80);
        assertEquals(80, pedal1.getPurchasePrice(),0);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(0, pedal1.getSalePrice(), 0);
    }

    @Test
    public void canSetSalePrice() {
        pedal1.setSalePrice(90);
        assertEquals(90, pedal1.getSalePrice(),0);
    }

    @Test
    public void canCalculateMarkup() {
        pedal1.setPurchasePrice(80);
        pedal1.setSalePrice(90);

        assertEquals(0.125, pedal1.calculateMarkup(), 0);
    }
}
