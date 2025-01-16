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
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }

    @Column( name="grocery_name" ,nullable = false,unique = true)
    private String name_of_grocery;
    public void setName_of_grocery(String name_of_grocery){
        this.name_of_grocery=name_of_grocery;
    }
    public String getName_of_grocery(){
        return name_of_grocery;
    }

    @Column(name ="rate",nullable = false, unique = true)
    private Long price;
    public void setPrice(Long price){
        this.price=price;
    }
    public Long getGetPrice(){
        return price;
    }
    public Groceries(Long id, String name_of_grocery, Long price){
        this.id=id;
        this.name_of_grocery=name_of_grocery;
        this.price=price;
    }


    public Groceries(){};


}
