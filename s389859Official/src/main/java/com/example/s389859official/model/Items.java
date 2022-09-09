package com.example.s389859official.model;


import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.List;

public class Items{
    private List<Item> itemList;



    public List<Item> getItemList(){
        if(itemList == null){
            itemList = new ArrayList<>();
        }
        return itemList;
    }
    public void setItemsList(List<Item> itemsList){this.itemList = itemsList;}

    public Item get(int i) {
        return itemList.get(0);
    }

    public Item deleteItem(int id) {
        itemList.remove(id);
        return (Item) itemList;
    }


    public void put(int id, Item item) {
    }

}