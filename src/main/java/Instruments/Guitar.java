package Instruments;

import Behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;

    public Guitar(String material, String colour, String type, int numberOfStrings, String sound) {
        super(material, colour, type, sound);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String playInstrument() {
        return this.sound;
    }

    public double calculateMarkup(int buyingPrice, int sellingPrice) {
        int change = buyingPrice - sellingPrice;
        return (change/buyingPrice) *100;
    }
}
