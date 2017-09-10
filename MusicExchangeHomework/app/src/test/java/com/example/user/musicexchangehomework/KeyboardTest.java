package com.example.user.musicexchangehomework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by user on 08/09/2017.
 */
public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("Keyboard", "Metal", "Black", "Keys", 90, 50);
    }

    @Test
    public void hasAName() {
        assertEquals("Keyboard", keyboard.getName() );
    }

    @Test
    public void hasAMaterial() {
        assertEquals("Metal", keyboard.getMaterial() );
    }

    @Test
    public void hasAColour() {
        assertEquals("Black", keyboard.getColour() );
    }

    @Test
    public void HasAType() {
        assertEquals("Keys", keyboard.getType() );
    }

    @Test
    public void hasASellValue() {
        assertEquals(90, keyboard.getSellValue() );
    }

    @Test
    public void hasABuyValue() {
        assertEquals(50, keyboard.getBuyValue() );
    }

    @Test
    public void canPlay() {
        assertEquals("Tap Tap!", keyboard.play() );
    }

    @Test
    public void hasAMarkup() {
        assertEquals(40, keyboard.calculateMarkup() );
    }

}