package Instruments;
import Items.Item;
import behaviours.IPlay;

public abstract class Instrument extends Item{

   private String colour;
    private String material;
    private InstrumentType instrumentType;

    public Instrument(String description, double buyingPrice, double sellingPrice, String colour, String material, InstrumentType instrumentType ){
        super(description,buyingPrice,sellingPrice);
        this.colour = colour;
        this.material = material;
        this.instrumentType = instrumentType;
    }

    public String getColour() {
        return this.colour;
    }

    public String getMaterial() {
        return this.material;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }




}
