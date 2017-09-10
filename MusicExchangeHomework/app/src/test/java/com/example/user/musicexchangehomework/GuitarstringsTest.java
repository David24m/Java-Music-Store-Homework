package com.example.user.musicexchangehomework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by user on 08/09/2017.
 */
public class GuitarstringsTest {

    Guitarstrings guitarstrings;

    @Before
    public void before(){
        guitarstrings = new Guitarstrings("Strings", 8, 4);
    }

    @Test
    public void HasAType() {
        assertEquals("Strings", guitarstrings.getType() );
    }

    @Test
    public void hasASellValue() {
        assertEquals(8, guitarstrings.getSellValue() );
    }

    @Test
    public void hasABuyValue() {
        assertEquals(4, guitarstrings.getBuyValue() );
    }

    @Test
    public void hasAMarkup() {
        assertEquals(4, guitarstrings.calculateMarkup() );
    }

}