package com.example.user.musicexchangehomework;

/**
 * Created by user on 08/09/2017.
 */

public class Drums extends Instrument {

    public Drums(String drums, String material, String colour, String type, int sellValue, int buyValue) {
        super(drums, material, colour, type, sellValue, buyValue);
    }

    public String play() {
        return "Bang Boom Blast!";
    }
}
