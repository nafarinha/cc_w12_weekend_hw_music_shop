import instruments.Guitar;
import instruments.InstrumentClassification;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar1;

    @Before
    public void before() {
        guitar1 = new Guitar("Fender", "Stratocaster", "Sunburst", InstrumentClassification.STRINGS, 6);
    }

    @Test
    public void canGetNumStrings() {
        assertEquals(6, guitar1.getNumStrings());
    }

    @Test
    public void canGetMake() {
        assertEquals("Fender", guitar1.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Stratocaster", guitar1.getModel());
    }

    @Test
    public void canGetColour() {
        assertEquals("Sunburst", guitar1.getColour());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(0, guitar1.getPurchasePrice(), 0);
    }

    @Test
    public void canSetPurchasePrice() {
        guitar1.setPurchasePrice(1000);
        assertEquals(1000, guitar1.getPurchasePrice(),0);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(0, guitar1.getSalePrice(), 0);
    }

    @Test
    public void canSetSalePrice() {
        guitar1.setSalePrice(1500);
        assertEquals(1500, guitar1.getSalePrice(),0);
    }

    @Test
    public void canGetClassification() {
        assertEquals(InstrumentClassification.STRINGS, guitar1.getClassification());
    }

    @Test
    public void canCalculateMarkup() {
        guitar1.setPurchasePrice(1000);
        guitar1.setSalePrice(1500);

        assertEquals(0.5, guitar1.calculateMarkup(), 0);
    }

    @Test
    public void canPlaySound() {
        assertEquals("Chunka Chunk", guitar1.play("Chunka Chunk"));
    }



}
