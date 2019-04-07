import accessories.Amp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmpTest {

    private Amp amp1;

    @Before
    public void before() {
        amp1 = new Amp("Marshall", "VBA400", "Valve");
    }

    @Test
    public void canGetMake() {
        assertEquals("Marshall", amp1.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("VBA400", amp1.getModel());
    }

    @Test
    public void canGetType() {
        assertEquals("Valve", amp1.getType());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(0, amp1.getPurchasePrice(), 0);
    }

    @Test
    public void canSetPurchasePrice() {
        amp1.setPurchasePrice(400);
        assertEquals(400, amp1.getPurchasePrice(),0);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(0, amp1.getSalePrice(), 0);
    }

    @Test
    public void canSetSalePrice() {
        amp1.setSalePrice(600);
        assertEquals(600, amp1.getSalePrice(),0);
    }

    @Test
    public void canCalculateMarkup() {
        amp1.setPurchasePrice(400);
        amp1.setSalePrice(600);

        assertEquals(0.5, amp1.calculateMarkup(), 0);
    }
}

