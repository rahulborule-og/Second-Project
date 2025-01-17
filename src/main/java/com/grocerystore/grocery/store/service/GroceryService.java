package com.grocerystore.grocery.store.service;

import com.grocerystore.grocery.store.dao.GroceryDao;
import com.grocerystore.grocery.store.entity.Groceries;

import java.util.List;


public interface GroceryService {
GroceryDao addGrocery(GroceryDao gdao);
GroceryDao getGroceryDetail(Long id);
void deleteGrocery(Long id);
GroceryDao updateDetails(Long id,GroceryDao gdao1);
List<GroceryDao> seeAllGrocery();
}
