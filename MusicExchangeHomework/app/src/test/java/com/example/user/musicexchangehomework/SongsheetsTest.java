package com.example.user.musicexchangehomework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by user on 08/09/2017.
 */
public class SongsheetsTest {

    Songsheets songsheets;

    @Before
    public void before(){
        songsheets = new Songsheets("Songsheets", 14, 4);
    }

    @Test
    public void HasAType() {
        assertEquals("Songsheets", songsheets.getType() );
    }

    @Test
    public void hasASellValue() {
        assertEquals(14, songsheets.getSellValue() );
    }

    @Test
    public void hasABuyValue() {
        assertEquals(4, songsheets.getBuyValue() );
    }

    @Test
    public void hasAMarkup() {
        assertEquals(10, songsheets.calculateMarkup() );
    }

}