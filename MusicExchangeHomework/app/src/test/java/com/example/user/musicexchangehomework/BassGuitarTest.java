package com.example.user.musicexchangehomework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by user on 08/09/2017.
 */
public class BassGuitarTest {

    BassGuitar bassGuitar;

    @Before
    public void before(){
        bassGuitar = new BassGuitar("Bass Guitar", "Wood", "Green", "Strings", 60, 20);
    }

    @Test
    public void hasAName() {
        assertEquals("Bass Guitar", bassGuitar.getName() );
    }

    @Test
    public void hasAMaterial() {
        assertEquals("Wood", bassGuitar.getMaterial() );
    }

    @Test
    public void hasAColour() {
        assertEquals("Green", bassGuitar.getColour() );
    }

    @Test
    public void HasAType() {
        assertEquals("Strings", bassGuitar.getType() );
    }

    @Test
    public void hasASellValue() {
        assertEquals(60, bassGuitar.getSellValue() );
    }

    @Test
    public void hasABuyValue() {
        assertEquals(20, bassGuitar.getBuyValue() );
    }

    @Test
    public void canPlay() {
        assertEquals("Deeper Strum!", bassGuitar.play() );
    }

    @Test
    public void hasAMarkup() {
        assertEquals(40, bassGuitar.calculateMarkup() );
    }

}