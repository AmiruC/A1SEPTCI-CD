package com.example.s389859official.dao;


import com.example.s389859official.model.Item;
import com.example.s389859official.model.Items;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDAO {
    private static Items list = new Items();

    static{
        list.getItemList().add(new Item("0","Mug","For drinks","mug.jpg",12.00));
        list.getItemList().add(new Item("1","Chair","For sitting","chair.jpg",55.00));
    }

    public Items getAllItems(){return list;}

    public Item getItemId(int id){
      return list.getItemList().get(id);
    }

    public static Item updateItem(int id, Item item){
        item.setId(String.valueOf(id));
        list.put(id,item);
        return item;
    }

    public Item deleteItem(int id){
        return list.getItemList().remove(id);
    }


//    public void addItem(Item item){list.getItemList().add(item);}
}
