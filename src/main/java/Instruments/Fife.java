package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Fife extends Instrument implements IPlay, ISell {

    private int numberOfHoles;

    public Fife(String material, String colour, String type, int numberOfHoles, String sound) {
        super(material, colour, type, sound);
        this.numberOfHoles = numberOfHoles;
    }

    public int getNumberOfHoles() {
        return numberOfHoles;
    }

    public String playInstrument() {
        return this.sound;
    }

    public double calculateMarkup(int buyingPrice, int sellingPrice) {
        int change = buyingPrice - sellingPrice;
        return (change/buyingPrice) *100;
    }
}
