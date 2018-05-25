package ItemsTest;

import Items.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {
    Drumsticks drumsticks;

    @Before
    public void before(){
        drumsticks = new Drumsticks("Vic Firth", 1.00, 3.00);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Vic Firth", drumsticks.getDescription());

    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(1.00, drumsticks.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(3.00, drumsticks.getSellingPrice(), 0.01);
    }
    @Test
    public void canSell(){
        assertEquals(2.00, drumsticks.sell(),0.01);
    }


}
