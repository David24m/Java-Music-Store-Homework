package com.example.user.musicexchangehomework;

/**
 * Created by user on 08/09/2017.
 */

public abstract class Instrument implements Playable, Sellable {

    String name;
    String material;
    String colour;
    String type;
    int sellValue;
    int buyValue;

    public Instrument(String name, String material, String colour, String type, int sellValue, int buyValue){
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.sellValue = sellValue;
        this.buyValue = buyValue;
    }

    public String getName() {
        return name;
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

    public int getSellValue() {
        return sellValue;
    }

    public int getBuyValue() {
        return buyValue;
    }

    public int calculateMarkup() {
        return sellValue - buyValue;
    }

}
