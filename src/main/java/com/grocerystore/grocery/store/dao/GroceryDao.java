package com.grocerystore.grocery.store.dao;


import jakarta.websocket.server.ServerEndpoint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class GroceryDao {
    private Long id;
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }
    private String grocery_name;
    public void setName_of_grocery(String grocery_name){
        this.grocery_name=grocery_name;
    }
    public String getName_of_grocery(){
        return grocery_name;
    }
    private Long price;
    public void setPrice(Long price){
        this.price=price;
    }
    public Long getGetPrice(){
        return price;
    }

    public GroceryDao(Long id, String grocery_name, Long price){
        this.id=id;
        this.grocery_name=grocery_name;
        this.price=price;
    };
    public GroceryDao(){};
}
