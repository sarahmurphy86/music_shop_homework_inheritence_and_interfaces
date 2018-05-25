package Instruments;

public class Guitar extends Instrument {

    private int strings;

    public Guitar(String description, double buyingPrice, double sellingPrice, String colour, String material, InstrumentType instrumentType, int strings) {
        super(description, buyingPrice, sellingPrice, colour, material, instrumentType);
        this.strings = strings;
    }

    public int getNumberOfStrings() {
        return this.strings;
    }
}
