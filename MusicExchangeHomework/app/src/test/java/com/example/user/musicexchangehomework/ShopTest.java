package com.example.user.musicexchangehomework;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by user on 08/09/2017.
 */
public class ShopTest {

    Shop shop;
    ArrayList<Sellable> stock;
    Guitar guitar;


    @Before
    public void before() {
        stock = new ArrayList<>();
        stock.add(new Guitar("Guitar", "Plastic", "Red", "Strings", 100, 40));
    }

    @Test
    public void canAddStock() {
        shop = new Shop();
//        ArrayList<Sellable> result = shop.getStock();
        assertEquals(1, shop.getStock().size());
    }

}