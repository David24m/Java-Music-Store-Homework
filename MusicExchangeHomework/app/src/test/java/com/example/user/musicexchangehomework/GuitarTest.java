package com.example.user.musicexchangehomework;

import org.junit.*;

import com.example.user.musicexchangehomework.*;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 08/09/2017.
 */
public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Guitar", "Plastic", "Red", "Strings", 100, 40);
    }

    @Test
    public void hasAName() {
        assertEquals("Guitar", guitar.getName());
    }

    @Test
    public void hasAMaterial() {
        assertEquals("Plastic", guitar.getMaterial() );
    }

    @Test
    public void hasAColour() {
        assertEquals("Red", guitar.getColour() );
    }

    @Test
    public void HasAType() {
        assertEquals("Strings", guitar.getType() );
    }

    @Test
    public void hasASellValue() {
        assertEquals(100, guitar.getSellValue() );
    }

    @Test
    public void hasABuyValue() {
        assertEquals(40, guitar.getBuyValue() );
    }

    @Test
    public void canPlay() {
        assertEquals("Strum!", guitar.play() );
    }

    @Test
    public void hasAMarkup() {
        assertEquals(60, guitar.calculateMarkup() );
    }



}