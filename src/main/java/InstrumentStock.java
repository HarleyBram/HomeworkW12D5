import Behaviours.IPlay;
import Behaviours.ISell;

public class InstrumentStock implements ISell {

    private int sellingPrice;
    private int buyingPrice;
    private IPlay instrument;

    public InstrumentStock(IPlay instrument, int buyingPrice, int sellingPrice) {
    this.instrument = instrument;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;

    }

    public double calculateMarkup(int buyingPrice, int sellingPrice) {
        int change = this.buyingPrice - this.sellingPrice;
        return (change/buyingPrice) *100;
    }
}
