package com.grocerystore.grocery.store.mapper;

import com.grocerystore.grocery.store.dao.GroceryDao;
import com.grocerystore.grocery.store.entity.Groceries;

public class DaoMappedtoEntity {
    public static Groceries maptoDao(GroceryDao gdao){
        return new Groceries(
                gdao.getId(),
                gdao.getName_of_grocery(),
                gdao.getGetPrice()

        );
    }
}
