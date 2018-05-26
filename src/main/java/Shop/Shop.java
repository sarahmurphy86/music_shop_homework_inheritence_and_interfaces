package Shop;

import Instruments.Guitar;
import Items.Item;


import java.util.ArrayList;

public class Shop {
    protected String name;
    protected ArrayList<Item> stockList;

    public Shop(String name){
        this.name = name;
        this.stockList = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int stockListCount() {
        return stockList.size();
    }


    public void addStock(Item item) {
        this.stockList.add(item);
    }

    public void removeStock(Item item) {
        this.stockList.remove(item);
    }

    public double getProfit() {
        double profit = 0;

        for (Item item : this.stockList){
            profit += item.calculateMarkup();
        }
        return profit;

    }
}
