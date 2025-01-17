package com.grocerystore.grocery.store.controller;

import com.grocerystore.grocery.store.dao.GroceryDao;
import com.grocerystore.grocery.store.service.GroceryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("groceries")
public class GroceryController {
@Autowired
private GroceryService groser;


@PostMapping("/add-grocery")
public ResponseEntity<GroceryDao> addGrocery(@RequestBody GroceryDao grdao){
    GroceryDao savedgrocery=groser.addGrocery(grdao);
    return new ResponseEntity<>(savedgrocery, HttpStatus.CREATED);

}

@GetMapping("{id}")
public ResponseEntity<GroceryDao> getGroceryDetails(@PathVariable("id") Long id){
    GroceryDao fetchedgrocery=groser.getGroceryDetail(id);
    return ResponseEntity.ok(fetchedgrocery);
}
}
