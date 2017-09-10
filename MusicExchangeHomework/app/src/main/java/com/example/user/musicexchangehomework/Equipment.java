package com.example.user.musicexchangehomework;

/**
 * Created by user on 08/09/2017.
 */

public abstract class Equipment implements Sellable {

    String type;
    int sellValue;
    int buyValue;

    public Equipment( String type, int sellValue, int buyValue){
        this.type = type;
        this.sellValue = sellValue;
        this.buyValue = buyValue;
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
