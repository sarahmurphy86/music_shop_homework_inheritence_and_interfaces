package Instruments;

import behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private String make;

    public Piano(String description, double buyingPrice, double sellingPrice, String colour, String material, InstrumentType instrumentType, String make) {
        super(description, buyingPrice, sellingPrice, colour, material, instrumentType);
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }
    public String play(String sound) {
        return "Piano can " + sound;
    }
}
