import instruments.InstrumentClassification;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano1;

    @Before
    public void before() {
        piano1 = new Piano("Steinway & Sons", "Model D", "Black", InstrumentClassification.STRINGS, "Concert Grand" );
    }

    @Test
    public void canGetType() {
        assertEquals("Concert Grand", piano1.getType());
    }

    @Test
    public void canGetMake() {
        assertEquals("Steinway & Sons", piano1.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Model D", piano1.getModel());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", piano1.getColour());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(0, piano1.getPurchasePrice(), 0);
    }

    @Test
    public void canSetPurchasePrice() {
        piano1.setPurchasePrice(40000);
        assertEquals(40000, piano1.getPurchasePrice(),0);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(0, piano1.getSalePrice(), 0);
    }

    @Test
    public void canSetSalePrice() {
        piano1.setSalePrice(60000);
        assertEquals(60000, piano1.getSalePrice(),0);
    }

    @Test
    public void canGetClassification() {
        assertEquals(InstrumentClassification.STRINGS, piano1.getClassification());
    }

    @Test
    public void canCalculateMarkup() {
        piano1.setPurchasePrice(40000);
        piano1.setSalePrice(60000);

        assertEquals(0.5, piano1.calculateMarkup(), 0);
    }

    @Test
    public void canPlaySound() {
        assertEquals("plink plink plink", piano1.play());
    }
}
