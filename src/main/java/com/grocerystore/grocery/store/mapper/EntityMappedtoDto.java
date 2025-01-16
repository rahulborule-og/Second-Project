package com.grocerystore.grocery.store.mapper;


import com.grocerystore.grocery.store.dao.GroceryDao;
import com.grocerystore.grocery.store.entity.Groceries;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EntityMappedtoDto {
    public static GroceryDao mapEntitytoDto(Groceries grocery){
      return new GroceryDao(
              grocery.getId(),
              grocery.getName_of_grocery(),
              grocery.getGetPrice()


      );


    }
}
