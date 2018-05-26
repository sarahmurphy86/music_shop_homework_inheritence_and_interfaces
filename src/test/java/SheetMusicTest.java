import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;


    @Before
    public void before(){
        sheetMusic = new SheetMusic("Adagio in D Minor", 10.00, 15.00);
}

    @Test
    public void canGetDescription(){
        assertEquals("Adagio in D Minor", sheetMusic.getDescription());

    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(10.00, sheetMusic.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(15.00, sheetMusic.getSellingPrice(), 0.01);
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(5.00, sheetMusic.calculateMarkup(),0.01);
    }


}
