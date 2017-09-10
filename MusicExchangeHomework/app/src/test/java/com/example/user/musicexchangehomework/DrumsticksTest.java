package com.example.user.musicexchangehomework;

import static org.junit.Assert.*;

import org.junit.*;

import com.example.user.musicexchangehomework.*;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 08/09/2017.
 */
public class DrumsticksTest {

    Drumsticks drumsticks;

    @Before
    public void before(){
        drumsticks = new Drumsticks("Drumsticks", 10, 5);
    }

    @Test
    public void HasAType() {
        assertEquals("Drumsticks", drumsticks.getType() );
    }

    @Test
    public void hasASellValue() {
        assertEquals(10, drumsticks.getSellValue() );
    }

    @Test
    public void hasABuyValue() {
        assertEquals(5, drumsticks.getBuyValue() );
    }

    @Test
    public void hasAMarkup() {
        assertEquals(5, drumsticks.calculateMarkup() );
    }

}