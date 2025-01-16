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
    private String grocery_name;
    private Long price;

    public GroceryDao(){};
}
