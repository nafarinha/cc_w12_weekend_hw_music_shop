import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet1;

    @Before
    public void before() {
        trumpet1 = new Trumpet("Henri Selmer", "B-flat", "Yellow", InstrumentType.BRASS, 3);
    }

    @Test
    public void canGetNumValves() {
        assertEquals(3, trumpet1.getNumValves());
    }

    @Test
    public void canGetMake() {
        assertEquals("Henri Selmer", trumpet1.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("B-flat", trumpet1.getModel());
    }

    @Test
    public void canGetColour() {
        assertEquals("Yellow", trumpet1.getColour());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(0, trumpet1.getPurchasePrice(), 0);
    }

    @Test
    public void canSetPurchasePrice() {
        trumpet1.setPurchasePrice(5000);
        assertEquals(5000, trumpet1.getPurchasePrice(),0);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(0, trumpet1.getSalePrice(), 0);
    }

    @Test
    public void canSetSalePrice() {
        trumpet1.setSalePrice(15000);
        assertEquals(15000, trumpet1.getSalePrice(),0);
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.BRASS, trumpet1.getType());
    }

    @Test
    public void canCalculateMarkup() {
        trumpet1.setPurchasePrice(5000);
        trumpet1.setSalePrice(15000);

        assertEquals(2, trumpet1.calculateMarkup(), 0);
    }

    @Test
    public void canPlaySound() {
        assertEquals("Tarantara", trumpet1.play("Tarantara"));
    }
}
