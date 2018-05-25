import org.junit.Before;
import org.junit.Test;
import Shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;

    @Before
    public void before(){
        shop = new Shop ("Rays Music Exchange");
    }

    @Test
    public void canGetName(){
        assertEquals("Rays Music Exchange", shop.getName());
    }

    @Test
    public void stockListStartsEmpty(){
        assertEquals(0, shop.stockListCount());
    }
}
