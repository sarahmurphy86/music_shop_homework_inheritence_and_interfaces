package Shop;

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
}
