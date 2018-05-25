import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender",400, 600, "Red", "wood", InstrumentType.STRINGS, 4);

    }

    @Test
    public void canGetColour(){
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.STRINGS,guitar.getInstrumentType());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(4, guitar.getNumberOfStrings());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(200.00, guitar.calculateMarkup(),0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Guitar can praang", guitar.play("praang"));

    }
}
