package Shop;

import behaviours.ISell;


import java.util.ArrayList;

public class Shop {
    protected String name;
    protected ArrayList<ISell> stockList;

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


    public void addStock(ISell item) {
        this.stockList.add(item);
    }

    public void removeStock(ISell item) {
        this.stockList.remove(item);
    }

    public double getProfit() {
        double profit = 0;

        for (ISell item : this.stockList){
            profit += item.calculateMarkup();
        }
        return profit;

    }
}
