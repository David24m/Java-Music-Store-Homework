package com.example.user.musicexchangehomework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by user on 08/09/2017.
 */
public class DrumsTest {

    Drums drum;

    @Before
    public void before(){
        drum = new Drums("Drums", "Metal", "Purple", "Percussion", 200, 120);
    }

    @Test
    public void hasAName() {
        assertEquals("Drums", drum.getName() );
    }

    @Test
    public void hasAMaterial() {
        assertEquals("Metal", drum.getMaterial() );
    }

    @Test
    public void hasAColour() {
        assertEquals("Purple", drum.getColour() );
    }

    @Test
    public void HasAType() {
        assertEquals("Percussion", drum.getType() );
    }

    @Test
    public void hasASellValue() {
        assertEquals(200, drum.getSellValue() );
    }

    @Test
    public void hasABuyValue() {
        assertEquals(120, drum.getBuyValue() );
    }

    @Test
    public void canPlay() {
        assertEquals("Bang Boom Blast!", drum.play() );
    }

    @Test
    public void hasAMarkup() {
        assertEquals(80, drum.calculateMarkup() );
    }

}