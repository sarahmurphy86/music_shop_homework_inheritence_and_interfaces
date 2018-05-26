package ItemsTest;

import Items.Drumstick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumstickTest {
    Drumstick drumstick;

    @Before
    public void before(){
        drumstick = new Drumstick("Vic Firth", 1.00, 3.00);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Vic Firth", drumstick.getDescription());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(1.00, drumstick.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(3.00, drumstick.getSellingPrice(), 0.01);
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(2.00, drumstick.calculateMarkup(),0.01);
    }


}
