package com.example.user.musicexchangehomework;

/**
 * Created by user on 08/09/2017.
 */

public class Keyboard extends Instrument {

    public Keyboard(String name, String material, String colour, String type, int sellValue, int buyValue) {
        super(name, material, colour, type, sellValue, buyValue);
    }

    public String play() {
        return "Tap Tap!";
    }
}
