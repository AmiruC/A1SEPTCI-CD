package com.example.s389859official.controller;

import com.example.s389859official.dao.ItemDAO;
import com.example.s389859official.model.Item;
import com.example.s389859official.model.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping (path = "/item")

public class ItemController {
    @Autowired
    private ItemDAO productsDAO;

    @GetMapping(path = "/", produces = "application/json")
    public Items getProducts() {
        return productsDAO.getAllItems();
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addProducts(
            @RequestHeader(name = "X-COM-PERSIST", required = false) String headerPersist,
            @RequestHeader(name = "X-COM-LOCATION", required = false, defaultValue = "ASIA") String headerLocation,
            @RequestBody Item item)
            throws Exception {
        int id = productsDAO.getAllItems().getItemList().size() + 1;
        item.setId("id");

//        productsDAO.addItem(item);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(item.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    //Get record by id
    @GetMapping("/item/{id}")
    public Item getItemId(@PathVariable String id){
        int number = Integer.parseInt(id);

        return productsDAO.getItemId(number);
    }

    //Put update Record by id
    @PutMapping("/update/{id}")
    public Item updateItem(@PathVariable String id, @RequestBody Item item){
        int number = Integer.parseInt(id);

        return productsDAO.updateItem(number,item);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteItem(@PathVariable(value = "id")String id){

        return true;
    }


}
