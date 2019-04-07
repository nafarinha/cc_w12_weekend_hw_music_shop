import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return  this.name;
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public void addToStock(ISell ... products) {
        for(ISell product : products) {
            this.stock.add(product);
        }
    }

    public void removeFromStock(ISell ... products) {
        for(ISell product : products) {
            this.stock.remove(product);
        }
    }
}
