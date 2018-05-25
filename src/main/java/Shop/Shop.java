package Shop;

import Instruments.Guitar;
import Items.Item;

import java.util.ArrayList;

public class Shop {
    protected String name;
    protected ArrayList<Item> stocklist;

    public Shop(String name){
        this.name = name;
        this.stocklist = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int stockListCount() {
        return stocklist.size();
    }


    public void addStock(Item item) {
        this.stocklist.add(item);
    }

    public void removeStock(Item item) {
        this.stocklist.remove(item);
    }
}
