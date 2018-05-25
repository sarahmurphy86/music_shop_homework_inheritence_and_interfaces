package Items;

import behaviours.ISell;

public abstract class Item implements ISell {
    protected String description;
    protected double buyingPrice;
    protected double sellingPrice;

    public Item(String description, double buyingPrice, double sellingPrice){
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }
    public double calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }
}
