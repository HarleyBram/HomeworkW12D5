import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private  String name;

    public Shop(String name, ArrayList<ISell> stock) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public void addToStock(ISell item){
        this.stock.add(item);
    }

    public void removeFromStock(ISell item){
        this.stock.remove(item);
    }

//    public int potentialProfit(){
//        int p = 0;
//        for(int i=0; i<1; i++){
//            p += this.stock.ISell.calculateMarkup();
//        }
//        return p;
//    }

}


