package com.grocerystore.grocery.store.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="groceries_table")
public class Groceries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name="grocery_name" ,nullable = false,unique = true)
    private String name_of_grocery;

    @Column(name ="rate",nullable = false, unique = true)
    private Long price;

    public Groceries(){};


}
