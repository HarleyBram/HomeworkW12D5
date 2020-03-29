package Instruments;

import Behaviours.IPlay;
import Instruments.Instrument;

public class Keyboard extends Instrument implements IPlay {

    private int numberOfKeys;

    public Keyboard(String material, String colour, String type, int numberOfKeys, String sound) {
        super(material, colour, type, sound);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String playInstrument() {
        return this.sound;
    }

    public double calculateMarkup(int buyingPrice, int sellingPrice) {
        int change = buyingPrice - sellingPrice;
        return (change/buyingPrice) *100;
    }
}
