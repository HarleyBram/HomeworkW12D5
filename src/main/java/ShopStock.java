import Behaviours.ISell;

public class ShopStock implements ISell {

    protected String type;
    protected int buyingPrice;
    protected int sellingPrice;


    public ShopStock(String type, int buyingPrice, int sellingPrice) {
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkup(int buyingPrice, int sellingPrice) {
        int change = this.buyingPrice - this.sellingPrice;
        return (change/buyingPrice) *100;
    }
}
