package com.example.s389859official.dao;


import com.example.s389859official.model.Item;
import com.example.s389859official.model.Items;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDAO {
    private static Items list = new Items();

    static{
        list.getItemList().add(new Item("0","Mug","For drinks",12.00));
        list.getItemList().add(new Item("1","Chair","For sitting",55.00));
    }

    public Items getAllItems(){return list;}
    public void addItem(Item item){list.getItemList().add(item);}
}
