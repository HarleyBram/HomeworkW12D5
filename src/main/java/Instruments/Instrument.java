package Instruments;

public abstract class Instrument {

    protected String material;
    protected String colour;
    protected String type;
    protected String sound;


    public Instrument(String material, String colour, String type, String sound) {
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }
}
