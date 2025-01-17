package com.grocerystore.grocery.store.service;

import com.grocerystore.grocery.store.dao.GroceryDao;
import com.grocerystore.grocery.store.entity.Groceries;


public interface GroceryService {
GroceryDao addGrocery(GroceryDao gdao);
GroceryDao getGroceryDetail(Long id);
void deleteGrocery(Long id);
GroceryDao updateDetails(Long id,GroceryDao gdao1);
}
