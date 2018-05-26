import Instruments.Guitar;
import Instruments.InstrumentType;
import Items.Drumstick;
import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;
import Shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;
    Drumstick drumstick;
    SheetMusic sheetMusic;

    @Before
    public void before(){
        shop = new Shop ("Rays Music Exchange");
        guitar = new Guitar("Fender",400, 600, "Red", "wood", InstrumentType.STRINGS, 4);
        drumstick = new Drumstick("Vic Firth", 1.00, 3.00);
        sheetMusic = new SheetMusic("Adagio in D Minor", 10.00, 15.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Rays Music Exchange", shop.getName());
    }

    @Test
    public void stockListStartsEmpty(){
        assertEquals(0, shop.stockListCount());
    }

    @Test
    public void canAddItemsToStockList(){
        shop.addStock(guitar);
        shop.addStock(drumstick);
        assertEquals(2, shop.stockListCount());
    }

    @Test
    public void canRemoveItemFromStockList(){
        shop.addStock(guitar);
        shop.addStock(drumstick);
        shop.removeStock(guitar);
        assertEquals(1, shop.stockListCount());
    }

    @Test
    public void canGetProfit(){
        shop.addStock(guitar);
        shop.addStock(drumstick);
        shop.addStock(sheetMusic);
        assertEquals(207.00, shop.getProfit(), 0.01);
    }

}
