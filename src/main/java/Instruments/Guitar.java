package Instruments;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int strings;

    public Guitar(String description, double buyingPrice, double sellingPrice, String colour, String material, InstrumentType instrumentType, int strings) {
        super(description, buyingPrice, sellingPrice, colour, material, instrumentType);
        this.strings = strings;
    }

    public int getNumberOfStrings() {
        return this.strings;
    }
    public String play(String sound) {
        return "Guitar can " + sound;
    }

}
