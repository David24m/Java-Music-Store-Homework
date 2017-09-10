package com.example.user.musicexchangehomework;

/**
 * Created by user on 08/09/2017.
 */

public class Guitar extends Instrument {

    public Guitar(String name, String material, String colour, String type, int sellValue, int buyValue) {
        super(name, material, colour, type, sellValue, buyValue);
    }

    public String play() {
        return "Strum!";
    }


}
