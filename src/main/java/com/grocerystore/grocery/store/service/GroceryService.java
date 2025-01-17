package com.grocerystore.grocery.store.service;

import com.grocerystore.grocery.store.dao.GroceryDao;



public interface GroceryService {
GroceryDao addGrocery(GroceryDao gdao);
GroceryDao getGroceryDetail(Long id);
}
