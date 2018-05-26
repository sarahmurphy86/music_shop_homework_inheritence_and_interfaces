import Instruments.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Grand Piano",1200,2200, "Black", "Wood", InstrumentType.KEYBOARD,"Steinway");
    }

    @Test
    public void canGetColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getInstrumentType());
    }

    @Test
    public void canGetMake(){
        assertEquals("Steinway", piano.getMake());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1000.00, piano.calculateMarkup(),0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Piano can plink plonk", piano.play("plink plonk"));

    }

}
