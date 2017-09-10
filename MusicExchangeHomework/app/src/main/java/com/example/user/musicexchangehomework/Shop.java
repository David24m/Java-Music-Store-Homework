package com.example.user.musicexchangehomework;

import java.util.ArrayList;

/**
 * Created by user on 08/09/2017.
 */

public class Shop {


    private ArrayList<Sellable> stock;

    public Shop(){
        this.stock = new ArrayList<>();
    }

    public ArrayList<Sellable> getStock(){
        return this.stock;
    }

    public void addStock(Sellable sellable){
        this.stock.add(sellable);
    }

//    public void removeStock(String stockToRemove){
//        for(int index= this.stock.size() - 1; index >= 0; index --){
//            String removableStock = this.stock.get(index).getName();
//
//            if(removableStock.equals(stockToRemove)){
//                this.stock.remove(index);
//            }
//        }
//    }
}
